package au.com.digitalspider.myfriends.api.contact.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.io.APIError;
import au.com.digitalspider.myfriends.api.contact.model.Lookup;
import au.com.digitalspider.myfriends.api.contact.service.LookupService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_LOOKUP)
public class LookupController {

	private Logger log = LogManager.getLogger(getClass());

	@Autowired
	private LookupService lookupService;

	@GetMapping("")
	public ResponseEntity<?> all() throws JsonProcessingException {
		Map<String, List<String>> data = new HashMap<>();
		data.put("Usage", Arrays.asList(ContactApiConstants.API_PATH_BASE + "/lookup/{type}"));
		data.put("Valid Types", Lookup.VALID_TYPES);
		return ResponseEntity.ok().body(data);
	}

	@GetMapping("/{type}")
	public ResponseEntity<?> get(@PathVariable String type) {
		try {
			List<Lookup> result = lookupService.findByType(type);
			return ResponseEntity.ok().body(result);
		} catch (Exception e) {
			log.error(e, e);
			return ResponseEntity.badRequest().body(new APIError(e));
		}
	}
}