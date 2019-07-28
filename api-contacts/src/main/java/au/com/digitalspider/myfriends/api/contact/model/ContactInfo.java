package au.com.digitalspider.myfriends.api.contact.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ContactInfo {
    private Long id;
    @Enumerated(EnumType.STRING)
    private ContactInfoType type;
    private String value;
    private String label;
    private String other;
    @JsonIgnore
    private Contact contact;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return ContactInfoType return the type
     */
    public ContactInfoType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ContactInfoType type) {
        this.type = type;
    }

    /**
     * @return String return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return String return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(String other) {
        this.other = other;
    }


    /**
     * @return Contact return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

}