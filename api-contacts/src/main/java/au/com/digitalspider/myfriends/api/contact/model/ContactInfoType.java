package au.com.digitalspider.myfriends.api.contact.model;

public enum ContactInfoType implements Lookup {
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

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name();
    }
}