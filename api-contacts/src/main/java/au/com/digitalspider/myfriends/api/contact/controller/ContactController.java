package au.com.digitalspider.myfriends.api.contact.controller;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Contact;
import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.service.ContactService;
import au.com.digitalspider.myfriends.api.contact.service.UserService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_CONTACT)
public class ContactController extends BaseController<Contact, Long> {
	@Autowired
	private ContactService contactService;
	@Autowired
	private UserService userService;

	@Override
	protected ContactService getBaseService() {
		return contactService;
	}

	@GetMapping("/contact/{id}/full")
	public ResponseEntity<?> getFull(Principal principal, @PathVariable Long id) {
		try {
			User user = userService.getUser(principal);
			Optional<Contact> optional = contactService.getExpanded(user, id);
			if (!optional.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok().body(optional.get());
		} catch (Exception e) {
			return handleError(e);
		}
	}
}