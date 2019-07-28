package au.com.digitalspider.myfriends.api.contact.model;

public enum State {
    NSW("New South Wales"),
    QLD("Queensland"),
    VIC("Victoria"),
    TAS("Tasmania"),
    SA("South Australia"),
    WA("Western Australia"),
    NT("Northern Territory"),
    ;

    private String label;

    State(String label) {
        this.label = label;
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }
}