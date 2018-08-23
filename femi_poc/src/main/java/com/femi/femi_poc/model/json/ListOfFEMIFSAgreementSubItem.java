
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfFEMIFSAgreementSubItem implements Serializable
{

    @SerializedName("FEMIFSAgreementSubItem")
    @Expose
    private List<FEMIFSAgreementSubItem> fEMIFSAgreementSubItem = null;
    private final static long serialVersionUID = 6435530656760871593L;

    public List<FEMIFSAgreementSubItem> getFEMIFSAgreementSubItem() {
        return fEMIFSAgreementSubItem;
    }

    public void setFEMIFSAgreementSubItem(List<FEMIFSAgreementSubItem> fEMIFSAgreementSubItem) {
        this.fEMIFSAgreementSubItem = fEMIFSAgreementSubItem;
    }

}
