package au.com.digitalspider.myfriends.api.contact.model;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public interface Lookup {
	public static final String STATUS = "STATUS";
	public static final String STATE = "STATE";
	public static final String COUNTRY = "COUNTRY";
	public static final String INFO = "INFO";

	public static final List<String> VALID_TYPES = Arrays.asList(STATUS, STATE, COUNTRY, INFO);

	public abstract String getName();

	public abstract String getLabel();
}