
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "SelfServiceRegisteredFlag",
    "BirthDate",
    "CellularPhone",
    "ContactId",
    "EmailAddress",
    "FirstName",
    "HomePhone",
    "IDExpirationDate",
    "IDInformation",
    "LastName",
    "PreferredCommunicationMethod",
    "ListOfFemiAsset-Insurance"
})
public class Contact implements Serializable
{

    @JsonProperty("Id")
    private String id;
    @JsonProperty("SelfServiceRegisteredFlag")
    private String selfServiceRegisteredFlag;
    @JsonProperty("BirthDate")
    private String birthDate;
    @JsonProperty("CellularPhone")
    private String cellularPhone;
    @JsonProperty("ContactId")
    private String contactId;
    @JsonProperty("EmailAddress")
    private String emailAddress;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("HomePhone")
    private String homePhone;
    @JsonProperty("IDExpirationDate")
    private String iDExpirationDate;
    @JsonProperty("IDInformation")
    private String iDInformation;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("PreferredCommunicationMethod")
    private String preferredCommunicationMethod;
    @JsonProperty("ListOfFemiAsset-Insurance")
    private ListOfFemiAssetInsurance listOfFemiAssetInsurance;
    private final static long serialVersionUID = 333777997450167517L;

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("SelfServiceRegisteredFlag")
    public String getSelfServiceRegisteredFlag() {
        return selfServiceRegisteredFlag;
    }

    @JsonProperty("SelfServiceRegisteredFlag")
    public void setSelfServiceRegisteredFlag(String selfServiceRegisteredFlag) {
        this.selfServiceRegisteredFlag = selfServiceRegisteredFlag;
    }

    @JsonProperty("BirthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("BirthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("CellularPhone")
    public String getCellularPhone() {
        return cellularPhone;
    }

    @JsonProperty("CellularPhone")
    public void setCellularPhone(String cellularPhone) {
        this.cellularPhone = cellularPhone;
    }

    @JsonProperty("ContactId")
    public String getContactId() {
        return contactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @JsonProperty("EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("EmailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("HomePhone")
    public String getHomePhone() {
        return homePhone;
    }

    @JsonProperty("HomePhone")
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @JsonProperty("IDExpirationDate")
    public String getIDExpirationDate() {
        return iDExpirationDate;
    }

    @JsonProperty("IDExpirationDate")
    public void setIDExpirationDate(String iDExpirationDate) {
        this.iDExpirationDate = iDExpirationDate;
    }

    @JsonProperty("IDInformation")
    public String getIDInformation() {
        return iDInformation;
    }

    @JsonProperty("IDInformation")
    public void setIDInformation(String iDInformation) {
        this.iDInformation = iDInformation;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("PreferredCommunicationMethod")
    public String getPreferredCommunicationMethod() {
        return preferredCommunicationMethod;
    }

    @JsonProperty("PreferredCommunicationMethod")
    public void setPreferredCommunicationMethod(String preferredCommunicationMethod) {
        this.preferredCommunicationMethod = preferredCommunicationMethod;
    }

    @JsonProperty("ListOfFemiAsset-Insurance")
    public ListOfFemiAssetInsurance getListOfFemiAssetInsurance() {
        return listOfFemiAssetInsurance;
    }

    @JsonProperty("ListOfFemiAsset-Insurance")
    public void setListOfFemiAssetInsurance(ListOfFemiAssetInsurance listOfFemiAssetInsurance) {
        this.listOfFemiAssetInsurance = listOfFemiAssetInsurance;
    }

}
