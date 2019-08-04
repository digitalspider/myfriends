package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.Document;
import au.com.digitalspider.myfriends.api.contact.repo.DocumentRepository;

@Service
public class DocumentService extends BaseService<Document, Long> {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	protected DocumentRepository getRepository() {
		return documentRepository;
	}
}