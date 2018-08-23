
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFemiAgreementLineItemAsset implements Serializable
{

    @SerializedName("FemiAgreementLineItemAsset")
    @Expose
    private List<FemiAgreementLineItemAsset> femiAgreementLineItemAsset = null;
    private final static long serialVersionUID = 7966369851638266882L;

    public List<FemiAgreementLineItemAsset> getFemiAgreementLineItemAsset() {
        return femiAgreementLineItemAsset;
    }

    public void setFemiAgreementLineItemAsset(List<FemiAgreementLineItemAsset> femiAgreementLineItemAsset) {
        this.femiAgreementLineItemAsset = femiAgreementLineItemAsset;
    }

}
