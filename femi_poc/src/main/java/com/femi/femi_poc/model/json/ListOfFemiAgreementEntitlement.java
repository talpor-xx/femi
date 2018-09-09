
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FemiAgreementEntitlement"
})
public class ListOfFemiAgreementEntitlement implements Serializable
{

    @JsonProperty("FemiAgreementEntitlement")
    private List<FemiAgreementEntitlement> femiAgreementEntitlement = null;
    private final static long serialVersionUID = -8710699408880458706L;

    @JsonProperty("FemiAgreementEntitlement")
    public List<FemiAgreementEntitlement> getFemiAgreementEntitlement() {
        return femiAgreementEntitlement;
    }

    @JsonProperty("FemiAgreementEntitlement")
    public void setFemiAgreementEntitlement(List<FemiAgreementEntitlement> femiAgreementEntitlement) {
        this.femiAgreementEntitlement = femiAgreementEntitlement;
    }

}
