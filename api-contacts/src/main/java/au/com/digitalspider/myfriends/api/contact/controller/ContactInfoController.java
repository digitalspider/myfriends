package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.ContactInfo;
import au.com.digitalspider.myfriends.api.contact.service.ContactInfoService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_CONTACTINFO)
public class ContactInfoController extends BaseController<ContactInfo, Long> {
	@Autowired
	private ContactInfoService contactInfoService;

	@Override
	protected ContactInfoService getBaseService() {
		return contactInfoService;
	}
}