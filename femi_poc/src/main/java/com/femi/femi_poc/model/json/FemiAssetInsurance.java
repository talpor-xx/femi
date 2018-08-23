
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FemiAssetInsurance implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("SerialNumber")
    @Expose
    private String serialNumber;
    @SerializedName("ListOfFemiAsset-Rider")
    @Expose
    private ListOfFemiAssetRider listOfFemiAssetRider;
    private final static long serialVersionUID = -5365466670916398959L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ListOfFemiAssetRider getListOfFemiAssetRider() {
        return listOfFemiAssetRider;
    }

    public void setListOfFemiAssetRider(ListOfFemiAssetRider listOfFemiAssetRider) {
        this.listOfFemiAssetRider = listOfFemiAssetRider;
    }

}
