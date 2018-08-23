
package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contacts implements Serializable
{

    @SerializedName("Contact")
    @Expose
    private List<Contact> contact = null;
    private final static long serialVersionUID = 5920695057585869143L;

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

}
