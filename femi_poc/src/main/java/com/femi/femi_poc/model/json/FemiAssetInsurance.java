
package com.femi.femi_poc.model.json;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "ProductName",
    "SerialNumber",
    "ListOfFemiAsset-Rider"
})
public class FemiAssetInsurance implements Serializable
{

    @JsonProperty("Id")
    private String id;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("SerialNumber")
    private String serialNumber;
    @JsonProperty("ListOfFemiAssetRider")
    private ListOfFemiAssetRider listOfFemiAssetRider;
    private final static long serialVersionUID = -5365466670916398959L;

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("SerialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("ListOfFemiAsset-Rider")
    public ListOfFemiAssetRider getListOfFemiAssetRider() {
        return listOfFemiAssetRider;
    }

    @JsonProperty("ListOfFemiAsset-Rider")
    public void setListOfFemiAssetRider(ListOfFemiAssetRider listOfFemiAssetRider) {
        this.listOfFemiAssetRider = listOfFemiAssetRider;
    }

}
