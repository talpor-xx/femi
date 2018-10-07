
package com.femi.femi_poc.model.json;

import java.io.Serializable;

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
public class FemiAgreementLineItemAsset implements Serializable
{

    @JsonProperty("NumberOfServicesRemaining")
    private String numberOfServicesRemaining;
    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    private ListOfFEMIFSAgreementSubItem listOfFEMIFSAgreementSubItem;
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
    private final static long serialVersionUID = -7727059931003610514L;

    @JsonProperty("NumberOfServicesRemaining")
    public String getNumberOfServicesRemaining() {
        return numberOfServicesRemaining;
    }

    @JsonProperty("NumberOfServicesRemaining")
    public void setNumberOfServicesRemaining(String numberOfServicesRemaining) {
        this.numberOfServicesRemaining = numberOfServicesRemaining;
    }

    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    public ListOfFEMIFSAgreementSubItem getListOfFEMIFSAgreementSubItem() {
        return listOfFEMIFSAgreementSubItem;
    }

    @JsonProperty("ListOfFEMIFSAgreementSubItem")
    public void setListOfFEMIFSAgreementSubItem(ListOfFEMIFSAgreementSubItem listOfFEMIFSAgreementSubItem) {
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

}
