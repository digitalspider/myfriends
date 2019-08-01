package au.com.digitalspider.myfriends.api.contact.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import au.com.digitalspider.myfriends.api.contact.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	Role findOneByName(String name);
}