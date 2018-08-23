
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("SelfServiceRegisteredFlag")
    @Expose
    private String selfServiceRegisteredFlag;
    @SerializedName("BirthDate")
    @Expose
    private String birthDate;
    @SerializedName("CellularPhone")
    @Expose
    private String cellularPhone;
    @SerializedName("ContactId")
    @Expose
    private String contactId;
    @SerializedName("EmailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("HomePhone")
    @Expose
    private String homePhone;
    @SerializedName("IDExpirationDate")
    @Expose
    private String iDExpirationDate;
    @SerializedName("IDInformation")
    @Expose
    private String iDInformation;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("PreferredCommunicationMethod")
    @Expose
    private String preferredCommunicationMethod;
    @SerializedName("ListOfFemiAsset-Insurance")
    @Expose
    private ListOfFemiAssetInsurance listOfFemiAssetInsurance;
    private final static long serialVersionUID = 333777997450167517L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelfServiceRegisteredFlag() {
        return selfServiceRegisteredFlag;
    }

    public void setSelfServiceRegisteredFlag(String selfServiceRegisteredFlag) {
        this.selfServiceRegisteredFlag = selfServiceRegisteredFlag;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellularPhone() {
        return cellularPhone;
    }

    public void setCellularPhone(String cellularPhone) {
        this.cellularPhone = cellularPhone;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getIDExpirationDate() {
        return iDExpirationDate;
    }

    public void setIDExpirationDate(String iDExpirationDate) {
        this.iDExpirationDate = iDExpirationDate;
    }

    public String getIDInformation() {
        return iDInformation;
    }

    public void setIDInformation(String iDInformation) {
        this.iDInformation = iDInformation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredCommunicationMethod() {
        return preferredCommunicationMethod;
    }

    public void setPreferredCommunicationMethod(String preferredCommunicationMethod) {
        this.preferredCommunicationMethod = preferredCommunicationMethod;
    }

    public ListOfFemiAssetInsurance getListOfFemiAssetInsurance() {
        return listOfFemiAssetInsurance;
    }

    public void setListOfFemiAssetInsurance(ListOfFemiAssetInsurance listOfFemiAssetInsurance) {
        this.listOfFemiAssetInsurance = listOfFemiAssetInsurance;
    }

}
