package au.com.digitalspider.myfriends.api.contact.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}