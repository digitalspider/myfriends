package au.com.digitalspider.myfriends.api.contact.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Contact;
import au.com.digitalspider.myfriends.api.contact.model.User;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    // @Query(
    //     "SELECT c FROM Contact c WHERE (c.deleted_at is null or c.deleted_at < now()) "+
    //     "and c.created_by = :userId")
    // Iterable<Contact> findByCreatedById(@Param("userId") Long userId);
    Iterable<Contact> findByCreatedBy(User user);
}