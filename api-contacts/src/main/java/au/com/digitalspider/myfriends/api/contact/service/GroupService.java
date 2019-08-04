package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.Group;
import au.com.digitalspider.myfriends.api.contact.repo.GroupRepository;

@Service
public class GroupService extends BaseAuditableService<Group, Long> {
	@Autowired
	private GroupRepository groupRepository;

	@Override
	protected GroupRepository getRepository() {
		return groupRepository;
	}

	@Override
	protected AuditableEntity getAuditableEntity(Group entity) {
		return entity;
	}
}