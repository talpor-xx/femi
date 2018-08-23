
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FemiAgreementLineItemAsset implements Serializable
{

    @SerializedName("NumberOfServicesRemaining")
    @Expose
    private String numberOfServicesRemaining;
    @SerializedName("ListOfFEMIFSAgreementSubItem")
    @Expose
    private ListOfFEMIFSAgreementSubItem listOfFEMIFSAgreementSubItem;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("ActivityCount")
    @Expose
    private String activityCount;
    @SerializedName("AgreementItemProductId")
    @Expose
    private String agreementItemProductId;
    @SerializedName("AgreementItemProductName")
    @Expose
    private String agreementItemProductName;
    @SerializedName("CurrentAvailableStock2")
    @Expose
    private String currentAvailableStock2;
    @SerializedName("DeductionMax2")
    @Expose
    private String deductionMax2;
    @SerializedName("DeductionMax-Percent")
    @Expose
    private String deductionMaxPercent;
    @SerializedName("MaximumQuantity")
    @Expose
    private String maximumQuantity;
    @SerializedName("ParentAgreementLineItemId")
    @Expose
    private String parentAgreementLineItemId;
    @SerializedName("PeriodUOM2")
    @Expose
    private String periodUOM2;
    @SerializedName("Write-InProduct")
    @Expose
    private String writeInProduct;
    private final static long serialVersionUID = -7727059931003610514L;

    public String getNumberOfServicesRemaining() {
        return numberOfServicesRemaining;
    }

    public void setNumberOfServicesRemaining(String numberOfServicesRemaining) {
        this.numberOfServicesRemaining = numberOfServicesRemaining;
    }

    public ListOfFEMIFSAgreementSubItem getListOfFEMIFSAgreementSubItem() {
        return listOfFEMIFSAgreementSubItem;
    }

    public void setListOfFEMIFSAgreementSubItem(ListOfFEMIFSAgreementSubItem listOfFEMIFSAgreementSubItem) {
        this.listOfFEMIFSAgreementSubItem = listOfFEMIFSAgreementSubItem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityCount() {
        return activityCount;
    }

    public void setActivityCount(String activityCount) {
        this.activityCount = activityCount;
    }

    public String getAgreementItemProductId() {
        return agreementItemProductId;
    }

    public void setAgreementItemProductId(String agreementItemProductId) {
        this.agreementItemProductId = agreementItemProductId;
    }

    public String getAgreementItemProductName() {
        return agreementItemProductName;
    }

    public void setAgreementItemProductName(String agreementItemProductName) {
        this.agreementItemProductName = agreementItemProductName;
    }

    public String getCurrentAvailableStock2() {
        return currentAvailableStock2;
    }

    public void setCurrentAvailableStock2(String currentAvailableStock2) {
        this.currentAvailableStock2 = currentAvailableStock2;
    }

    public String getDeductionMax2() {
        return deductionMax2;
    }

    public void setDeductionMax2(String deductionMax2) {
        this.deductionMax2 = deductionMax2;
    }

    public String getDeductionMaxPercent() {
        return deductionMaxPercent;
    }

    public void setDeductionMaxPercent(String deductionMaxPercent) {
        this.deductionMaxPercent = deductionMaxPercent;
    }

    public String getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(String maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public String getParentAgreementLineItemId() {
        return parentAgreementLineItemId;
    }

    public void setParentAgreementLineItemId(String parentAgreementLineItemId) {
        this.parentAgreementLineItemId = parentAgreementLineItemId;
    }

    public String getPeriodUOM2() {
        return periodUOM2;
    }

    public void setPeriodUOM2(String periodUOM2) {
        this.periodUOM2 = periodUOM2;
    }

    public String getWriteInProduct() {
        return writeInProduct;
    }

    public void setWriteInProduct(String writeInProduct) {
        this.writeInProduct = writeInProduct;
    }

}
