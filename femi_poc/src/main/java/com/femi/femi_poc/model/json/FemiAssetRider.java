
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FemiAssetRider implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("AccountName")
    @Expose
    private String accountName;
    @SerializedName("OwnerAccountId")
    @Expose
    private String ownerAccountId;
    @SerializedName("PolicySourceId")
    @Expose
    private String policySourceId;
    @SerializedName("PrimaryContactId2")
    @Expose
    private String primaryContactId2;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("ListOfFemiAgreementEntitlement")
    @Expose
    private ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement;
    private final static long serialVersionUID = -2624027829571265715L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public String getPolicySourceId() {
        return policySourceId;
    }

    public void setPolicySourceId(String policySourceId) {
        this.policySourceId = policySourceId;
    }

    public String getPrimaryContactId2() {
        return primaryContactId2;
    }

    public void setPrimaryContactId2(String primaryContactId2) {
        this.primaryContactId2 = primaryContactId2;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListOfFemiAgreementEntitlement getListOfFemiAgreementEntitlement() {
        return listOfFemiAgreementEntitlement;
    }

    public void setListOfFemiAgreementEntitlement(ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement) {
        this.listOfFemiAgreementEntitlement = listOfFemiAgreementEntitlement;
    }

}
