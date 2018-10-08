
package com.femi.femi_poc.model.json;

import java.util.Date;
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
    private String Expose;
    @JsonProperty("MaximumServices")
    private String MaximumServices;
    @JsonProperty("Name4")
    private String Name4;
    @JsonProperty("QualificationDate2")
    private Date QualificationDate2;
    @JsonProperty("SumServicesUsage")
    private String SumServicesUsage;
    @JsonProperty("listOfFemiAgreementLineItemAsset")
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
        return Expose;
    }

    @JsonProperty("Expose")
    public void setExpose(String expose) {
        this.Expose = expose;
    }

    @JsonProperty("MaximumServices")
    public String getMaximumServices() {
        return MaximumServices;
    }

    @JsonProperty("MaximumServices")
    public void setMaximumServices(String maximumServices) {
        this.MaximumServices = maximumServices;
    }

    @JsonProperty("Name4")
    public String getName4() {
        return Name4;
    }

    @JsonProperty("Name4")
    public void setName4(String name4) {
        this.Name4 = name4;
    }

    @JsonProperty("QualificationDate2")
    public Date getQualificationDate2() {
        return QualificationDate2;
    }

    @JsonProperty("QualificationDate2")
    public void setQualificationDate2(Date qualificationDate2) {
        this.QualificationDate2 = qualificationDate2;
    }

    @JsonProperty("SumServicesUsage")
    public String getSumServicesUsage() {
        return SumServicesUsage;
    }

    @JsonProperty("SumServicesUsage")
    public void setSumServicesUsage(String sumServicesUsage) {
        this.SumServicesUsage = sumServicesUsage;
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
    
}
