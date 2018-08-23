
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFemiAssetInsurance implements Serializable
{

    @SerializedName("FemiAsset-Insurance")
    @Expose
    private FemiAssetInsurance femiAssetInsurance;
    private final static long serialVersionUID = 1404160448797383814L;

    public FemiAssetInsurance getFemiAssetInsurance() {
        return femiAssetInsurance;
    }

    public void setFemiAssetInsurance(FemiAssetInsurance femiAssetInsurance) {
        this.femiAssetInsurance = femiAssetInsurance;
    }

}
