package au.com.digitalspider.myfriends.api.contact.model;

public enum ContactInfoType {
    NAME("Name"),
    BIRTHDAY("Birthday"),
    ANNIVERSARY("Anniversary"),
    DATE("Date"),
    EMAIL("Email"),
    PHONE("Phone"),
    LINK("URL Link"),
    INTEREST("Interest"),
    ORGANISATION("Organisation"),
    EDUCATION("Education"),
    OTHER("Other"),
    ;

    private String label;

    ContactInfoType(String label) {
        this.label = label;
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }
}