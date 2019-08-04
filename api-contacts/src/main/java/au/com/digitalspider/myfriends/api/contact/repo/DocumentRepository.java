package au.com.digitalspider.myfriends.api.contact.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
}