
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFemiAssetRider implements Serializable
{

    @SerializedName("FemiAsset-Rider")
    @Expose
    private FemiAssetRider femiAssetRider;
    private final static long serialVersionUID = -4414195727471244033L;

    public FemiAssetRider getFemiAssetRider() {
        return femiAssetRider;
    }

    public void setFemiAssetRider(FemiAssetRider femiAssetRider) {
        this.femiAssetRider = femiAssetRider;
    }

}
