package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Document;
import au.com.digitalspider.myfriends.api.contact.service.DocumentService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_DOCUMENT)
public class DocumentController extends BaseController<Document, Long> {
	@Autowired
	private DocumentService documentService;

	@Override
	protected DocumentService getBaseService() {
		return documentService;
	}
}