package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Group;
import au.com.digitalspider.myfriends.api.contact.service.GroupService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_GROUP)
public class GroupController extends BaseController<Group, Long> {
	@Autowired
	private GroupService groupService;

	@Override
	protected GroupService getBaseService() {
		return groupService;
	}
}