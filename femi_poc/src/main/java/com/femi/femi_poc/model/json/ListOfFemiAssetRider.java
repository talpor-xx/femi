
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FemiAsset-Rider"
})
public class ListOfFemiAssetRider implements Serializable
{

    @JsonProperty("FemiAsset-Rider")
    private FemiAssetRider femiAssetRider;
    private final static long serialVersionUID = -4414195727471244033L;

    @JsonProperty("FemiAsset-Rider")
    public FemiAssetRider getFemiAssetRider() {
        return femiAssetRider;
    }

    @JsonProperty("FemiAsset-Rider")
    public void setFemiAssetRider(FemiAssetRider femiAssetRider) {
        this.femiAssetRider = femiAssetRider;
    }

}
