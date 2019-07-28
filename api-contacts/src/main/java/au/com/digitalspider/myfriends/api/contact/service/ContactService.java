package au.com.digitalspider.myfriends.api.contact.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.Contact;
import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.repo.ContactRepository;

@Service
public class ContactService extends BaseAuditableService<Contact, Long> {
    @Autowired
    private ContactRepository contactRepository;
    
    @Override
    protected ContactRepository getRepository() {
        return contactRepository;
    }

    @Override
    protected Contact getAuditableEntity(Contact entity) {
        return entity;
    }

    @Override
    public Iterable<Contact> all(User user) {
        return contactRepository.findByCreatedById(user.getId());
    }

    public Optional<Contact> getExpanded(User user, Long id) throws Exception {
        Optional<Contact> result = get(user, id);
        if (result.isPresent()) {
            Contact contact = result.get();
            contact.getContactInfoList().size(); // populate list
            contact.getAddressList().size(); // populate list
            result = Optional.of(contact);
        }
        return result;
    }
}