
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FEMIFSAgreementSubItem implements Serializable
{

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("ParentAgreementItemId")
    @Expose
    private String parentAgreementItemId;
    @SerializedName("ProductId")
    @Expose
    private String productId;
    @SerializedName("LineNumber")
    @Expose
    private String lineNumber;
    @SerializedName("Product")
    @Expose
    private String product;
    @SerializedName("Write-InProduct")
    @Expose
    private String writeInProduct;
    @SerializedName("LineNumber2")
    @Expose
    private String lineNumber2;
    private final static long serialVersionUID = 6411221798360685909L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentAgreementItemId() {
        return parentAgreementItemId;
    }

    public void setParentAgreementItemId(String parentAgreementItemId) {
        this.parentAgreementItemId = parentAgreementItemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getWriteInProduct() {
        return writeInProduct;
    }

    public void setWriteInProduct(String writeInProduct) {
        this.writeInProduct = writeInProduct;
    }

    public String getLineNumber2() {
        return lineNumber2;
    }

    public void setLineNumber2(String lineNumber2) {
        this.lineNumber2 = lineNumber2;
    }

}
