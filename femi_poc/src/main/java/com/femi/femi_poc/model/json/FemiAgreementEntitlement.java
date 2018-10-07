package com.femi.femi_poc.model.json;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Expose",
    "MaximumServices",
    "Name4",
    "QualificationDate2",
    "SumServicesUsage",
    "ListOfFemiAgreementLineItemAsset"
})
public class FemiAgreementEntitlement {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Expose")
    private String expose;
    @JsonProperty("MaximumServices")
    private String maximumServices;
    @JsonProperty("Name4")
    private String name4;
    @JsonProperty("QualificationDate2")
    private String qualificationDate2;
    @JsonProperty("SumServicesUsage")
    private String sumServicesUsage;
    @JsonProperty("ListOfFemiAgreementLineItemAsset")
    private List<ListOfFemiAgreementLineItemAsset> listOfFemiAgreementLineItemAsset = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Expose")
    public String getExpose() {
        return expose;
    }

    @JsonProperty("Expose")
    public void setExpose(String expose) {
        this.expose = expose;
    }

    @JsonProperty("MaximumServices")
    public String getMaximumServices() {
        return maximumServices;
    }

    @JsonProperty("MaximumServices")
    public void setMaximumServices(String maximumServices) {
        this.maximumServices = maximumServices;
    }

    @JsonProperty("Name4")
    public String getName4() {
        return name4;
    }

    @JsonProperty("Name4")
    public void setName4(String name4) {
        this.name4 = name4;
    }

    @JsonProperty("QualificationDate2")
    public String getQualificationDate2() {
        return qualificationDate2;
    }

    @JsonProperty("QualificationDate2")
    public void setQualificationDate2(String qualificationDate2) {
        this.qualificationDate2 = qualificationDate2;
    }

    @JsonProperty("SumServicesUsage")
    public String getSumServicesUsage() {
        return sumServicesUsage;
    }

    @JsonProperty("SumServicesUsage")
    public void setSumServicesUsage(String sumServicesUsage) {
        this.sumServicesUsage = sumServicesUsage;
    }

    @JsonProperty("ListOfFemiAgreementLineItemAsset")
    public List<ListOfFemiAgreementLineItemAsset> getListOfFemiAgreementLineItemAsset() {
        return listOfFemiAgreementLineItemAsset;
    }

    @JsonProperty("ListOfFemiAgreementLineItemAsset")
    public void setListOfFemiAgreementLineItemAsset(List<ListOfFemiAgreementLineItemAsset> listOfFemiAgreementLineItemAsset) {
        this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public FemiAgreementEntitlement(String id, String expose, String maximumServices, String name4,
			String qualificationDate2, String sumServicesUsage,
			List<ListOfFemiAgreementLineItemAsset> listOfFemiAgreementLineItemAsset,
			Map<String, Object> additionalProperties) {
		super();
		this.id = id;
		this.expose = expose;
		this.maximumServices = maximumServices;
		this.name4 = name4;
		this.qualificationDate2 = qualificationDate2;
		this.sumServicesUsage = sumServicesUsage;
		this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
		this.additionalProperties = additionalProperties;
	}

    
}
