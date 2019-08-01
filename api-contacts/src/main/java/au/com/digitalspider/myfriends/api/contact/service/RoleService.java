package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.Role;
import au.com.digitalspider.myfriends.api.contact.repo.RoleRepository;

@Service
public class RoleService extends BaseService<Role, Long> {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	protected RoleRepository getRepository() {
		return roleRepository;
	}

	public Role findOneByName(String name) {
		return roleRepository.findOneByName(name);
	}
}