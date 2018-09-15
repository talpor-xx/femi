package com.femi.femi_poc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.femi.femi_poc.model.json.Contact;
import com.femi.femi_poc.model.json.Contacts;
import com.femi.femi_poc.model.json.FemiAgreementEntitlement;
import com.femi.femi_poc.model.json.FemiAssetInsurance;
import com.femi.femi_poc.model.json.FemiAssetRider;
import com.femi.femi_poc.model.json.ListOfFemiAgreementEntitlement;
import com.femi.femi_poc.model.json.ListOfFemiAssetInsurance;
import com.femi.femi_poc.model.json.ListOfFemiAssetRider;

public class AccessProxy {

	private static class DefaultTrustManager implements X509TrustManager {


        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType)
				throws java.security.cert.CertificateException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType)
				throws java.security.cert.CertificateException {
			// TODO Auto-generated method stub
			
		}
}
	// HTTP GET request
	public static String getContactDetails(String id, String area) {
        final HostnameVerifier validHosts = new HostnameVerifier() {

            @Override
            public boolean verify(final String arg0, final SSLSession arg1) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(validHosts);

        // configure the SSLContext with a TrustManager
        SSLContext ctx;
		try {
			ctx = SSLContext.getInstance("TLS");
	        ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
	        SSLContext.setDefault(ctx);
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (KeyManagementException e2) {
			e2.printStackTrace();
		}
		
        
        
		StringBuilder str = new StringBuilder();

	    //String baseUrl = "http://femi-proxy.apps.openshift.local";
		String proxyPathEnv = System.getenv("FEMI_PROXY_PATH");
		System.out.println("proxyPath ENV: " + proxyPathEnv);

		String proxyPathProperty = System.getProperty("femi.proxy.path");
		System.out.println("proxyPath System Property: " + proxyPathProperty);

	    String baseUrl = "https://femi-proxy-secured.apps.openshift.local";
	    if (proxyPathEnv!=null){
	        baseUrl = proxyPathEnv;
	    }
	    // http://femi-proxy.apps.openshift.local/api/areas/%D7%91%D7%A8%D7%99%D7%90%D7%95%D7%AA/contacts/036785343

	    String areaEncodedString = "";
		try {
			areaEncodedString = URLEncoder.encode(area , "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		//String baseUrl = "http://localhost:8282";
	    String urlPath = baseUrl + "/api/areas/"+ areaEncodedString + "/contacts/" + id;
		System.out.println("urlPath: " + urlPath);
		// String urlPath = "http://localhost:8282/api/areas/health/contacts/" +
		// id + "?area=" + area;
		// URLEncoder.encode(urlParameters, "UTF-8")
		try {
			URL url = new URL(urlPath);
			
	        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	       /* conn.setHostnameVerifier(new HostnameVerifier() {
	            @Override
	            public boolean verify(String arg0, SSLSession arg1) {
	                return true;
	            }
	        });*/
	        System.out.println(conn.getResponseCode());
	        

			InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "windows-1255");
			//InputStreamReader isr = new InputStreamReader(url.openStream(), "windows-1255");
			BufferedReader in = new BufferedReader(isr);

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String line = convertToUTF8(inputLine);
				str.append(line);
			}

			/*
			 * BufferedReader in = new BufferedReader( new
			 * InputStreamReader(oracle.openStream()));
			 * 
			 * String inputLine; while ((inputLine = in.readLine()) != null)
			 * str.append(inputLine);
			 */
			in.close();
	        conn.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str.toString();
	}

	public static List<FemiAgreementEntitlement> getContactDetailsWithoutContactsRootElement(Contacts contacts) {
		List<FemiAgreementEntitlement> result = null;
		for (Contact contact : contacts.getContact()) {
			ListOfFemiAssetInsurance listOfFemiAssetInsurance = contact.getListOfFemiAssetInsurance();
			if (listOfFemiAssetInsurance != null) {
				FemiAssetInsurance femiAssetInsurance = listOfFemiAssetInsurance.getFemiAssetInsurance();
				if (femiAssetInsurance != null) {
					ListOfFemiAssetRider listOfFemiAssetRider = femiAssetInsurance.getListOfFemiAssetRider();
					if (listOfFemiAssetRider != null) {
						FemiAssetRider femiAssetRider = listOfFemiAssetRider.getFemiAssetRider();
						if (femiAssetRider != null) {
							ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement = femiAssetRider
									.getListOfFemiAgreementEntitlement();
							if (listOfFemiAgreementEntitlement != null) {
								List<FemiAgreementEntitlement> femiAgreementEntitlementList = listOfFemiAgreementEntitlement
										.getFemiAgreementEntitlement();
								if (femiAgreementEntitlementList != null) {
									result = femiAgreementEntitlementList;
								} else {
									femiAgreementEntitlementList = new ArrayList<FemiAgreementEntitlement>();
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	public static List<FemiAgreementEntitlement> fetchContactDetails(String id, String area) {
		List<FemiAgreementEntitlement> result = new ArrayList<FemiAgreementEntitlement>();;
		String content = getContactDetails(id, area);

		ObjectMapper mapper = new ObjectMapper();
		Contacts rootObject = null;
		try {
			rootObject = mapper.readValue(content, Contacts.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Contact contact : rootObject.getContact()) {
			ListOfFemiAssetInsurance listOfFemiAssetInsurance = contact.getListOfFemiAssetInsurance();
			if (listOfFemiAssetInsurance != null) {
				FemiAssetInsurance femiAssetInsurance = listOfFemiAssetInsurance.getFemiAssetInsurance();
				if (femiAssetInsurance != null) {
					ListOfFemiAssetRider listOfFemiAssetRider = femiAssetInsurance.getListOfFemiAssetRider();
					if (listOfFemiAssetRider != null) {
						FemiAssetRider femiAssetRider = listOfFemiAssetRider.getFemiAssetRider();
						if (femiAssetRider != null) {
							ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement = femiAssetRider
									.getListOfFemiAgreementEntitlement();
							if (listOfFemiAgreementEntitlement != null) {
								List<FemiAgreementEntitlement> femiAgreementEntitlementList = listOfFemiAgreementEntitlement
										.getFemiAgreementEntitlement();
								if (femiAgreementEntitlementList != null) {
									result.addAll(femiAgreementEntitlementList);
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	// convert from internal Java String format -> UTF-8
	public static String convertToUTF8(String s) {
		String out = null;
		try {
			out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
		} catch (java.io.UnsupportedEncodingException e) {
			return null;
		}
		return out;
	}

	public static String test() {
		String urlPath = "http://localhost:8282/api/areas/health/contacts/036785343";

		StringBuffer response = new StringBuffer();
		URL obj;
		try {
			obj = new URL(urlPath);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "windows-1255"));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response.toString();

	}
}
