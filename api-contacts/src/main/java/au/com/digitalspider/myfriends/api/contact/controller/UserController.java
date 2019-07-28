package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.model.User;
import au.com.digitalspider.myfriends.api.contact.service.UserService;

@RestController("/user")
public class UserController extends BaseController<User, Long> {
    @Autowired
    private UserService userService;

    @Override
    protected UserService getBaseService() {
        return userService;
    }
}