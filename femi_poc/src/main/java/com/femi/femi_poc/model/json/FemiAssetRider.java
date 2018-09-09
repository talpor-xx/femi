
package com.femi.femi_poc.model.json;


import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "AccountName",
    "OwnerAccountId",
    "PolicySourceId",
    "PrimaryContactId2",
    "ProductName",
    "StartDate",
    "ListOfFemiAgreementEntitlement"
})
public class FemiAssetRider implements Serializable
{

    @JsonProperty("Id")
    private String id;
    @JsonProperty("AccountName")
    private String accountName;
    @JsonProperty("OwnerAccountId")
    private String ownerAccountId;
    @JsonProperty("PolicySourceId")
    private String policySourceId;
    @JsonProperty("PrimaryContactId2")
    private String primaryContactId2;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("ListOfFemiAgreementEntitlement")
    private ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement;
    private final static long serialVersionUID = -2624027829571265715L;

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("AccountName")
    public String getAccountName() {
        return accountName;
    }

    @JsonProperty("AccountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @JsonProperty("OwnerAccountId")
    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    @JsonProperty("OwnerAccountId")
    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    @JsonProperty("PolicySourceId")
    public String getPolicySourceId() {
        return policySourceId;
    }

    @JsonProperty("PolicySourceId")
    public void setPolicySourceId(String policySourceId) {
        this.policySourceId = policySourceId;
    }

    @JsonProperty("PrimaryContactId2")
    public String getPrimaryContactId2() {
        return primaryContactId2;
    }

    @JsonProperty("PrimaryContactId2")
    public void setPrimaryContactId2(String primaryContactId2) {
        this.primaryContactId2 = primaryContactId2;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("ListOfFemiAgreementEntitlement")
    public ListOfFemiAgreementEntitlement getListOfFemiAgreementEntitlement() {
        return listOfFemiAgreementEntitlement;
    }

    @JsonProperty("ListOfFemiAgreementEntitlement")
    public void setListOfFemiAgreementEntitlement(ListOfFemiAgreementEntitlement listOfFemiAgreementEntitlement) {
        this.listOfFemiAgreementEntitlement = listOfFemiAgreementEntitlement;
    }

}
