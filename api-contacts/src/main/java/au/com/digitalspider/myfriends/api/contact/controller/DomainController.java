package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Domain;
import au.com.digitalspider.myfriends.api.contact.service.DomainService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_DOMAIN)
public class DomainController extends BaseController<Domain, Long> {
	@Autowired
	private DomainService domainService;

	@Override
	protected DomainService getBaseService() {
		return domainService;
	}
}