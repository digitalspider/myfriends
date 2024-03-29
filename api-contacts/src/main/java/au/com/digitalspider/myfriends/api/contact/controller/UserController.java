package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.service.UserService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_USER)
public class UserController extends BaseController<User, Long> {
	@Autowired
	private UserService userService;

	@Override
	protected UserService getBaseService() {
		return userService;
	}
}