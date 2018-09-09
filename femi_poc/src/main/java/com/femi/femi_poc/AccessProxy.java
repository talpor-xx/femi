package com.femi.femi_poc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.net.URLEncoder;

import com.femi.femi_poc.model.json.Contacts;
import com.femi.femi_poc.model.json.Contact;
import com.femi.femi_poc.model.json.FemiAgreementEntitlement;
import com.femi.femi_poc.model.json.FemiAssetInsurance;
import com.femi.femi_poc.model.json.FemiAssetRider;
import com.femi.femi_poc.model.json.ListOfFemiAgreementEntitlement;
import com.femi.femi_poc.model.json.ListOfFemiAssetInsurance;
import com.femi.femi_poc.model.json.ListOfFemiAssetRider;
import com.fasterxml.jackson.databind.ObjectMapper;


public class AccessProxy {


	// HTTP GET request
	public static String getContactDetails(String id, String area) {
	    
	    String urlPath = "http://localhost:8282/api/areas/health/contacts/" + id;
	    System.out.println("urlPath: " + urlPath);
	    // String urlPath = "http://localhost:8282/api/areas/health/contacts/" + id + "?area=" + area;
	    // URLEncoder.encode(urlParameters, "UTF-8")

		StringBuffer response = new StringBuffer();
		URL obj;
		try {
			obj = new URL(urlPath);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream(),"windows-1255"));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} catch (IOException e) {
		    System.out.println("failed to access the proxy to get Contact information");
			e.printStackTrace();
		}
		return response.toString();
	}
	
		public static List<FemiAgreementEntitlement> fetchContactDetails(String id, String area) {
	    	List<FemiAgreementEntitlement> result = null;
//    	    Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyyy").create();

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
									    result = femiAgreementEntitlementList;
									}
									else{
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

	
}
