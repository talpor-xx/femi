
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFemiAgreementEntitlement implements Serializable
{

    @SerializedName("FemiAgreementEntitlement")
    @Expose
    private List<FemiAgreementEntitlement> femiAgreementEntitlement = null;
    private final static long serialVersionUID = -8710699408880458706L;

    public List<FemiAgreementEntitlement> getFemiAgreementEntitlement() {
        return femiAgreementEntitlement;
    }

    public void setFemiAgreementEntitlement(List<FemiAgreementEntitlement> femiAgreementEntitlement) {
        this.femiAgreementEntitlement = femiAgreementEntitlement;
    }

}
