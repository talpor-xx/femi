
package com.femi.femi_poc.model.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FemiAgreementEntitlement"
})
public class ListOfFemiAgreementEntitlement {

    @JsonProperty("FemiAgreementEntitlement")
    private List<FemiAgreementEntitlement> femiAgreementEntitlement = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FemiAgreementEntitlement")
    public List<FemiAgreementEntitlement> getFemiAgreementEntitlement() {
        return femiAgreementEntitlement;
    }

    @JsonProperty("FemiAgreementEntitlement")
    public void setFemiAgreementEntitlement(List<FemiAgreementEntitlement> femiAgreementEntitlement) {
        this.femiAgreementEntitlement = femiAgreementEntitlement;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
