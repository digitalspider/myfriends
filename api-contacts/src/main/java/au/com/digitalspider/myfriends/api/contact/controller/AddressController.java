package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.model.Address;
import au.com.digitalspider.myfriends.api.contact.service.AddressService;

@RestController("/address")
public class AddressController extends BaseController<Address, Long> {
    @Autowired
    private AddressService addressService;

    @Override
    protected AddressService getBaseService() {
        return addressService;
    }
}