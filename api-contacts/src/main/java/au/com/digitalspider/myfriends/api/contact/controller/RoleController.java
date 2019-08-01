package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Role;
import au.com.digitalspider.myfriends.api.contact.service.RoleService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_ROLE)
public class RoleController extends BaseController<Role, Long> {
	@Autowired
	private RoleService roleService;

	@Override
	protected RoleService getBaseService() {
		return roleService;
	}
}