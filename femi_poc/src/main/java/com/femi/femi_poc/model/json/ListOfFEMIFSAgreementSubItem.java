
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FEMIFSAgreementSubItem"
})
public class ListOfFEMIFSAgreementSubItem implements Serializable
{

    @JsonProperty("FEMIFSAgreementSubItem")
    private List<FEMIFSAgreementSubItem> fEMIFSAgreementSubItem = null;
    private final static long serialVersionUID = 6435530656760871593L;

    @JsonProperty("FEMIFSAgreementSubItem")
    public List<FEMIFSAgreementSubItem> getFEMIFSAgreementSubItem() {
        return fEMIFSAgreementSubItem;
    }

    @JsonProperty("FEMIFSAgreementSubItem")
    public void setFEMIFSAgreementSubItem(List<FEMIFSAgreementSubItem> fEMIFSAgreementSubItem) {
        this.fEMIFSAgreementSubItem = fEMIFSAgreementSubItem;
    }

}
