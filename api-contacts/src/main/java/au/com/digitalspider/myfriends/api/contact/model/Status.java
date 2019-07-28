package au.com.digitalspider.myfriends.api.contact.model;

public enum Status {
    GOOD("Good"),
    SICK("Not Well"),
    HELP("Needs Help"),
    DEAD("Passed Away"),
    ;

    private String label;

    Status(String label) {
        this.label = label;
    }

    /**
     * @return String return the label
     */
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return String.format("{'name': '%s', 'label': '%s'}", this.name(), this.getLabel());
    }
}