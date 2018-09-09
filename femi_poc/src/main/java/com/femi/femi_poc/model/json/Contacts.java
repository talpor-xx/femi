
package com.femi.femi_poc.model.json;


import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Contact"
})
public class Contacts implements Serializable
{

    @JsonProperty("Contact")
    private List<Contact> contact = null;
    private final static long serialVersionUID = 5920695057585869143L;

    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

}

