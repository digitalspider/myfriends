package au.com.digitalspider.myfriends.api.contact.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.MappedSuperclass;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.User;

@MappedSuperclass
public abstract class BaseAuditableService<ENTITY, ID> extends BaseService<ENTITY, ID> {

    protected abstract AuditableEntity getAuditableEntity(ENTITY entity);

    @Override
    public Optional<ENTITY> get(User user, ID id) throws Exception {
        Optional<ENTITY> result = super.get(user, id);
        if (result.isPresent() && getAuditableEntity(result.get()).getCreatedBy().getId()!=user.getId()) {
            throw new Exception("You do not have permission to view this entity");
        }
        return result;
    }

    @Override
    public ENTITY save(User user, ENTITY entity) throws Exception {
        if (entity!=null && getAuditableEntity(entity).getCreatedBy().getId()!=user.getId()) {
            throw new Exception("You do not have permission to update this entity");
        }
        getAuditableEntity(entity).setUpdatedBy(user);
        getAuditableEntity(entity).setUpdatedAt(LocalDateTime.now());
        return super.save(user, entity);
    }
}