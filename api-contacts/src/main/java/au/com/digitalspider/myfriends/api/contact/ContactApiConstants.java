package au.com.digitalspider.myfriends.api.contact;

import java.util.Arrays;
import java.util.List;

public class ContactApiConstants {
	public static final String API_PATH_BASE = "/api/v1";
	public static final String API_PATH_CONTACT = API_PATH_BASE + "/contact";
	public static final String API_PATH_ADDRESS = API_PATH_BASE + "/address";
	public static final String API_PATH_CONTACTINFO = API_PATH_BASE + "/info";
	public static final String API_PATH_LOOKUP = API_PATH_BASE + "/lookup";
	public static final String API_PATH_USER = API_PATH_BASE + "/user";
	public static final String API_PATH_ROLE = API_PATH_BASE + "/role";
	public static final String API_PATH_GROUP = API_PATH_BASE + "/group";
	public static final String API_PATH_DOMAIN = API_PATH_BASE + "/domain";
	public static final String API_PATH_DOCUMENT = API_PATH_BASE + "/document";
	public static final String API_PATH_POST = API_PATH_BASE + "/post";
	public static final String API_PATH_MESSAGE = API_PATH_BASE + "/message";

	public static final List<String> VALID_API_PATHS = Arrays.asList(
		API_PATH_CONTACT, API_PATH_ADDRESS, API_PATH_CONTACTINFO, API_PATH_LOOKUP,
		API_PATH_USER, API_PATH_ROLE, API_PATH_GROUP, API_PATH_DOMAIN,
		API_PATH_POST, API_PATH_DOCUMENT, API_PATH_MESSAGE
	);
}
