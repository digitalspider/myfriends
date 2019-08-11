package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.ContactGroup;
import au.com.digitalspider.myfriends.api.contact.service.ContactGroupService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_GROUP)
public class ContactGroupController extends BaseController<ContactGroup, Long> {
	@Autowired
	private ContactGroupService contactGroupService;

	@Override
	protected ContactGroupService getBaseService() {
		return contactGroupService;
	}
}