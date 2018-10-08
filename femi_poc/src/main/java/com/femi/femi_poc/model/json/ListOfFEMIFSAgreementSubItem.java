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
    "Id",
    "ParentAgreementItemId",
    "ProductId",
    "LineNumber",
    "Product",
    "Write-InProduct",
    "LineNumber2"
})
public class ListOfFEMIFSAgreementSubItem {
    @JsonProperty("Id")
    private String id;
    @JsonProperty("ParentAgreementItemId")
    private String parentAgreementItemId;
    @JsonProperty("ProductId")
    private String productId;
    @JsonProperty("LineNumber")
    private String lineNumber;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("Write-InProduct")
    private String writeInProduct;
    @JsonProperty("LineNumber2")
    private String lineNumber2;
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

    @JsonProperty("ParentAgreementItemId")
    public String getParentAgreementItemId() {
        return parentAgreementItemId;
    }

    @JsonProperty("ParentAgreementItemId")
    public void setParentAgreementItemId(String parentAgreementItemId) {
        this.parentAgreementItemId = parentAgreementItemId;
    }

    @JsonProperty("ProductId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("ProductId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("LineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("LineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("Product")
    public String getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(String product) {
        this.product = product;
    }

    @JsonProperty("Write-InProduct")
    public String getWriteInProduct() {
        return writeInProduct;
    }

    @JsonProperty("Write-InProduct")
    public void setWriteInProduct(String writeInProduct) {
        this.writeInProduct = writeInProduct;
    }

    @JsonProperty("LineNumber2")
    public String getLineNumber2() {
        return lineNumber2;
    }

    @JsonProperty("LineNumber2")
    public void setLineNumber2(String lineNumber2) {
        this.lineNumber2 = lineNumber2;
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
