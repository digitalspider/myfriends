package au.com.digitalspider.myfriends.api.contact.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.ContactInfoType;
import au.com.digitalspider.myfriends.api.contact.model.Country;
import au.com.digitalspider.myfriends.api.contact.model.Lookup;
import au.com.digitalspider.myfriends.api.contact.model.State;
import au.com.digitalspider.myfriends.api.contact.model.Status;

@Service
public class LookupService {
    public List<?> findByType(String type) {
        List<?> result = new ArrayList<>();
        switch(type.toUpperCase()) {
            case Lookup.STATUS:
                result = Arrays.asList(Status.values());
                break;
            case Lookup.COUNTRY:
                result = Arrays.asList(Country.values());
                break;
            case Lookup.STATE:
                result = Arrays.asList(State.values());
                break;
            case Lookup.INFOTYPE:
                result = Arrays.asList(ContactInfoType.values());
                break;
        }
        return result;
    }
}