package au.com.digitalspider.myfriends.api.contact.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    @Query(
        "SELECT c FROM Contact c WHERE (c.deleted_at is null or c.deleted_at < now()) "+
        "and c.created_by = :userId")
    List<Contact> findByCreatedBy(@Param("userId") Long userId);
}