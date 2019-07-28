package au.com.digitalspider.myfriends.api.contact.model;

public enum Country {
    AU("Australia"),
    ;

    private String label;

    Country(String label) {
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