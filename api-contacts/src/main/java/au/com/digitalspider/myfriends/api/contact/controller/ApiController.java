package au.com.digitalspider.myfriends.api.contact.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_BASE)
public class ApiController {

	@GetMapping("")
	public ResponseEntity<?> all() throws JsonProcessingException {
		Map<String, List<String>> data = new HashMap<>();
		data.put("Usage", Arrays.asList(ContactApiConstants.API_PATH_BASE + "/{entity}"));
		data.put("Valid entity values", ContactApiConstants.VALID_API_PATHS);
		return ResponseEntity.ok().body(data);
	}
}