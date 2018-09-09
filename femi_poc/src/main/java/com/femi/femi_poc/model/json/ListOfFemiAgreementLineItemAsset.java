
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FemiAgreementLineItemAsset"
})
public class ListOfFemiAgreementLineItemAsset implements Serializable
{

    @JsonProperty("FemiAgreementLineItemAsset")
    private List<FemiAgreementLineItemAsset> femiAgreementLineItemAsset = null;
    private final static long serialVersionUID = 7966369851638266882L;

    @JsonProperty("FemiAgreementLineItemAsset")
    public List<FemiAgreementLineItemAsset> getFemiAgreementLineItemAsset() {
        return femiAgreementLineItemAsset;
    }

    @JsonProperty("FemiAgreementLineItemAsset")
    public void setFemiAgreementLineItemAsset(List<FemiAgreementLineItemAsset> femiAgreementLineItemAsset) {
        this.femiAgreementLineItemAsset = femiAgreementLineItemAsset;
    }

}
