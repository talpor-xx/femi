package com.femi.femi_poc.model.json;


import java.io.Serializable;

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
public class FemiAgreementEntitlement implements Serializable
{

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
    private ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset;
    
    @JsonIgnore
    private java.util.Date currentDate = new java.util.Date();
    private final static long serialVersionUID = 7862339401013262127L;

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
    public ListOfFemiAgreementLineItemAsset getListOfFemiAgreementLineItemAsset() {
        return listOfFemiAgreementLineItemAsset;
    }

    @JsonProperty("ListOfFemiAgreementLineItemAsset")
    public void setListOfFemiAgreementLineItemAsset(ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset) {
        this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
    }

    @JsonIgnore	public java.util.Date getCurrentDate() {
		return currentDate;
	}

}
