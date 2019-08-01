package au.com.digitalspider.myfriends.api.contact.model;

public enum Status implements Lookup {
	GOOD("Good"), SICK("Not Well"), HELP("Needs Help"), DEAD("Passed Away"),;

	private String label;

	Status(String label) {
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