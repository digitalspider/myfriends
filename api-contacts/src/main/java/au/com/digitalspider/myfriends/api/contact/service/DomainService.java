package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.Domain;
import au.com.digitalspider.myfriends.api.contact.repo.DomainRepository;

@Service
public class DomainService extends BaseAuditableService<Domain, Long> {
	@Autowired
	private DomainRepository domainRepository;

	@Override
	protected DomainRepository getRepository() {
		return domainRepository;
	}

	@Override
	protected AuditableEntity getAuditableEntity(Domain entity) {
		return entity;
	}
}