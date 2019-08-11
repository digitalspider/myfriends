package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.ContactGroup;
import au.com.digitalspider.myfriends.api.contact.repo.ContactGroupRepository;

@Service
public class ContactGroupService extends BaseAuditableService<ContactGroup, Long> {
	@Autowired
	private ContactGroupRepository contactGroupRepository;

	@Override
	protected ContactGroupRepository getRepository() {
		return contactGroupRepository;
	}

	@Override
	protected AuditableEntity getAuditableEntity(ContactGroup entity) {
		return entity;
	}
}