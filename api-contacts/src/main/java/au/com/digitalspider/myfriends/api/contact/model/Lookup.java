package au.com.digitalspider.myfriends.api.contact.model;

public interface Lookup {
    public static final String STATUS = "STATUS";
    public static final String STATE = "STATE";
    public static final String COUNTRY = "COUNTRY";
    public static final String INFOTYPE = "INFOTYPE";

    public abstract String name();
    public abstract String getLabel();
}