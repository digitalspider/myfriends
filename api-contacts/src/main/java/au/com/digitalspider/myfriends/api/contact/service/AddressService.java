package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.digitalspider.myfriends.api.contact.model.Address;
import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.repo.AddressRepository;

public class AddressService extends BaseAuditableService<Address, Long> {
    @Autowired
    private AddressRepository addressRepository;
    
    @Override
    protected AddressRepository getRepository() {
        return addressRepository;
    }

    @Override
    protected AuditableEntity getAuditableEntity(Address entity) {
        return entity.getContact();
    }
}