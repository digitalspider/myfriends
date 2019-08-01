package au.com.digitalspider.myfriends.api.contact.controller;

import java.security.Principal;
import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import au.com.digitalspider.myfriends.api.contact.io.APIError;
import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.service.BaseService;
import au.com.digitalspider.myfriends.api.contact.service.UserService;

@MappedSuperclass
public abstract class BaseController<ENTITY, ID> {

	@Autowired
	private UserService userService;

	protected Logger log = LogManager.getLogger(getClass());

	protected abstract BaseService<ENTITY, ID> getBaseService();

	protected ResponseEntity<APIError> handleError(Exception e) {
		log.error(e, e);
		return ResponseEntity.badRequest().body(new APIError(e));
	}

	protected ResponseEntity<APIError> handleError(String message, Exception e) {
		log.error(e, e);
		return ResponseEntity.badRequest().body(new APIError(message, e));
	}

	protected User getUser(Principal principal) {
		User user = userService.getUser(principal);
		return user;
	}

	@GetMapping("")
	public ResponseEntity<?> all(Principal principal) {
		try {
			User user = getUser(principal);
			Iterable<ENTITY> results = getBaseService().all(user);
			return ResponseEntity.ok().body(results);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> get(Principal principal, @PathVariable ID id) {
		try {
			User user = getUser(principal);
			Optional<ENTITY> optional = getBaseService().get(user, id);
			if (!optional.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok().body(optional.get());
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@PostMapping("/{id}")
	public ResponseEntity<?> update(Principal principal, @PathVariable ID id, @RequestBody ENTITY entity) {
		try {
			User user = getUser(principal);
			entity = getBaseService().save(user, entity);
			return ResponseEntity.ok().body(entity);
		} catch (Exception e) {
			return handleError(e);
		}
	}
}