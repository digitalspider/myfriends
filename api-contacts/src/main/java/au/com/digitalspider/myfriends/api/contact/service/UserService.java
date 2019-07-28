package au.com.digitalspider.myfriends.api.contact.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.repo.UserRepository;

public class UserService extends BaseService<User, Long> implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    protected UserRepository getRepository() {
        return userRepository;
    }

    public User getUser(Principal principal) {
        return loadUserByUsername(principal.getName());
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = userRepository.findByUsername(username);
        if (users.size()>1) {
            throw new UsernameNotFoundException(
                String.format("Found multiple users (%d) with username: %s", users.size(), username));
        }
        if (users.size()==1) {
            return users.get(0);
        }
        throw new UsernameNotFoundException(
            String.format("No user with username: %s", username));
    }

}