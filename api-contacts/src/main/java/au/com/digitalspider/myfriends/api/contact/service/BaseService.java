package au.com.digitalspider.myfriends.api.contact.service;

import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.repository.CrudRepository;

import au.com.digitalspider.myfriends.api.contact.model.User;

@MappedSuperclass
public abstract class BaseService<ENTITY, ID> {
    protected Logger log = LogManager.getLogger(getClass());

    protected abstract CrudRepository<ENTITY, ID> getRepository();
    
    public Iterable<ENTITY> all(User user) throws Exception {
        return getRepository().findAll();
    }

    public Optional<ENTITY> get(User user, ID id) throws Exception {
        return getRepository().findById(id);
    }

    public ENTITY save(User user, ENTITY entity) throws Exception {
        return getRepository().save(entity);
    }
}