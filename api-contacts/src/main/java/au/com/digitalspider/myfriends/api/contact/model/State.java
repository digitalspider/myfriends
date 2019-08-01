package au.com.digitalspider.myfriends.api.contact.model;

public enum State implements Lookup {
	NSW("New South Wales"), QLD("Queensland"), VIC("Victoria"), TAS("Tasmania"), SA("South Australia"),
	WA("Western Australia"), NT("Northern Territory"),;

	private String label;

	State(String label) {
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