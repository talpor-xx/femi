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
    "NumberOfServicesRemaining",
    "ListOfFEMIFSAgreementSubItem",
    "Id",
    "ActivityCount",
    "AgreementItemProductId",
    "AgreementItemProductName",
    "CurrentAvailableStock2",
    "DeductionMax2",
    "DeductionMax-Percent",
    "MaximumQuantity",
    "ParentAgreementLineItemId",
    "PeriodUOM2",
    "Write-InProduct"
})
public class ListOfFemiAgreementLineItemAsset {

    @JsonProperty("NumberOfServicesRemaining")
    private String numberOfServicesRemaining;
    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    private List<ListOfFEMIFSAgreementSubItem> listOfFEMIFSAgreementSubItem;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("ActivityCount")
    private String activityCount;
    @JsonProperty("AgreementItemProductId")
    private String agreementItemProductId;
    @JsonProperty("AgreementItemProductName")
    private String agreementItemProductName;
    @JsonProperty("CurrentAvailableStock2")
    private String currentAvailableStock2;
    @JsonProperty("DeductionMax2")
    private String deductionMax2;
    @JsonProperty("DeductionMax-Percent")
    private String deductionMaxPercent;
    @JsonProperty("MaximumQuantity")
    private String maximumQuantity;
    @JsonProperty("ParentAgreementLineItemId")
    private String parentAgreementLineItemId;
    @JsonProperty("PeriodUOM2")
    private String periodUOM2;
    @JsonProperty("Write-InProduct")
    private String writeInProduct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NumberOfServicesRemaining")
    public String getNumberOfServicesRemaining() {
        return numberOfServicesRemaining;
    }

    @JsonProperty("NumberOfServicesRemaining")
    public void setNumberOfServicesRemaining(String numberOfServicesRemaining) {
        this.numberOfServicesRemaining = numberOfServicesRemaining;
    }

    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    public List<ListOfFEMIFSAgreementSubItem> getListOfFEMIFSAgreementSubItem() {
        return listOfFEMIFSAgreementSubItem;
    }

    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    public void setListOfFEMIFSAgreementSubItem(List<ListOfFEMIFSAgreementSubItem> listOfFEMIFSAgreementSubItem) {
        this.listOfFEMIFSAgreementSubItem = listOfFEMIFSAgreementSubItem;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("ActivityCount")
    public String getActivityCount() {
        return activityCount;
    }

    @JsonProperty("ActivityCount")
    public void setActivityCount(String activityCount) {
        this.activityCount = activityCount;
    }

    @JsonProperty("AgreementItemProductId")
    public String getAgreementItemProductId() {
        return agreementItemProductId;
    }

    @JsonProperty("AgreementItemProductId")
    public void setAgreementItemProductId(String agreementItemProductId) {
        this.agreementItemProductId = agreementItemProductId;
    }

    @JsonProperty("AgreementItemProductName")
    public String getAgreementItemProductName() {
        return agreementItemProductName;
    }

    @JsonProperty("AgreementItemProductName")
    public void setAgreementItemProductName(String agreementItemProductName) {
        this.agreementItemProductName = agreementItemProductName;
    }

    @JsonProperty("CurrentAvailableStock2")
    public String getCurrentAvailableStock2() {
        return currentAvailableStock2;
    }

    @JsonProperty("CurrentAvailableStock2")
    public void setCurrentAvailableStock2(String currentAvailableStock2) {
        this.currentAvailableStock2 = currentAvailableStock2;
    }

    @JsonProperty("DeductionMax2")
    public String getDeductionMax2() {
        return deductionMax2;
    }

    @JsonProperty("DeductionMax2")
    public void setDeductionMax2(String deductionMax2) {
        this.deductionMax2 = deductionMax2;
    }

    @JsonProperty("DeductionMax-Percent")
    public String getDeductionMaxPercent() {
        return deductionMaxPercent;
    }

    @JsonProperty("DeductionMax-Percent")
    public void setDeductionMaxPercent(String deductionMaxPercent) {
        this.deductionMaxPercent = deductionMaxPercent;
    }

    @JsonProperty("MaximumQuantity")
    public String getMaximumQuantity() {
        return maximumQuantity;
    }

    @JsonProperty("MaximumQuantity")
    public void setMaximumQuantity(String maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    @JsonProperty("ParentAgreementLineItemId")
    public String getParentAgreementLineItemId() {
        return parentAgreementLineItemId;
    }

    @JsonProperty("ParentAgreementLineItemId")
    public void setParentAgreementLineItemId(String parentAgreementLineItemId) {
        this.parentAgreementLineItemId = parentAgreementLineItemId;
    }

    @JsonProperty("PeriodUOM2")
    public String getPeriodUOM2() {
        return periodUOM2;
    }

    @JsonProperty("PeriodUOM2")
    public void setPeriodUOM2(String periodUOM2) {
        this.periodUOM2 = periodUOM2;
    }

    @JsonProperty("Write-InProduct")
    public String getWriteInProduct() {
        return writeInProduct;
    }

    @JsonProperty("Write-InProduct")
    public void setWriteInProduct(String writeInProduct) {
        this.writeInProduct = writeInProduct;
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
