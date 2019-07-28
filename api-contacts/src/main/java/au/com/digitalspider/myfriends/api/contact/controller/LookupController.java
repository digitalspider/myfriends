package au.com.digitalspider.myfriends.api.contact.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.io.APIError;
import au.com.digitalspider.myfriends.api.contact.service.LookupService;

@RestController("/lookup")
public class LookupController {

    private Logger log = LogManager.getLogger(getClass());

    @Autowired
    private LookupService lookupService;

    @GetMapping("/{type}")
    public ResponseEntity<?> get(@PathVariable String type) {
        try {
            List<?> result = lookupService.findByType(type);
            return ResponseEntity.ok().body(result.toString());
        } catch (Exception e) {
            log.error(e, e);
            return ResponseEntity.badRequest().body(new APIError(e));
        }
    }
}