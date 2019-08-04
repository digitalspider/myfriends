package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.Message;
import au.com.digitalspider.myfriends.api.contact.repo.MessageRepository;

@Service
public class MessageService extends BaseAuditableService<Message, Long> {
	@Autowired
	private MessageRepository messageRepository;

	@Override
	protected MessageRepository getRepository() {
		return messageRepository;
	}

	@Override
	protected AuditableEntity getAuditableEntity(Message entity) {
		return entity;
	}
}