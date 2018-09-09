
package com.femi.femi_poc.model.json;

import java.io.Serializable;
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
public class FEMIFSAgreementSubItem implements Serializable
{

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
    private final static long serialVersionUID = 6411221798360685909L;

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

}
