package au.com.digitalspider.myfriends.api.contact.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Contact extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
    @NotBlank
    @Size(min = 2, max = 128, message = "length must be 2 to 128")
    private String name;
    private String notes;
    @ManyToOne
    private Document image;
    @Enumerated(EnumType.STRING)
    private Status status = Status.GOOD;
    @OneToMany(mappedBy = "contact", fetch = FetchType.LAZY)
    private List<ContactInfo> contactInfoList = new ArrayList<>();
    @OneToMany(mappedBy = "contact", fetch = FetchType.LAZY)
    private List<Address> addressList = new ArrayList<>();

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
     * @return User return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return Document return the image
     */
    public Document getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Document image) {
        this.image = image;
    }

    /**
     * @return Status return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }


    /**
     * @return List<ContactInfo> return the contactInfoList
     */
    public List<ContactInfo> getContactInfoList() {
        return contactInfoList;
    }

    /**
     * @param contactInfoList the contactInfoList to set
     */
    public void setContactInfoList(List<ContactInfo> contactInfoList) {
        this.contactInfoList = contactInfoList;
    }

    /**
     * @return List<Address> return the addressList
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /**
     * @param addressList the addressList to set
     */
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

}