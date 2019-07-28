package au.com.digitalspider.myfriends.api.contact.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Contact;
import au.com.digitalspider.myfriends.api.contact.model.ContactInfo;

@Repository
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long> {

    List<ContactInfo> findByContact(Contact contact);
}