
package com.femi.femi_poc.model.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RootObject {

    @SerializedName("Contacts")
    @Expose
    private Contacts contacts;

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

}
