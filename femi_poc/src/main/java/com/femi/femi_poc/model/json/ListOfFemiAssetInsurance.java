
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FemiAsset-Insurance"
})
public class ListOfFemiAssetInsurance implements Serializable
{

    @JsonProperty("FemiAsset-Insurance")
    private FemiAssetInsurance femiAssetInsurance;
    private final static long serialVersionUID = 1404160448797383814L;

    @JsonProperty("FemiAsset-Insurance")
    public FemiAssetInsurance getFemiAssetInsurance() {
        return femiAssetInsurance;
    }

    @JsonProperty("FemiAsset-Insurance")
    public void setFemiAssetInsurance(FemiAssetInsurance femiAssetInsurance) {
        this.femiAssetInsurance = femiAssetInsurance;
    }

}
