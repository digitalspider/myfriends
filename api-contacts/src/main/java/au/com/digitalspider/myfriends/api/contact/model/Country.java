package au.com.digitalspider.myfriends.api.contact.model;

public enum Country implements Lookup {
	AU("Australia");

	private String label;

	Country(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getName() {
		return name();
	}
}