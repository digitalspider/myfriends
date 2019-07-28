package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.ContactInfo;
import au.com.digitalspider.myfriends.api.contact.repo.ContactInfoRepository;

@Service
public class ContactInfoService extends BaseAuditableService<ContactInfo, Long> {
    @Autowired
    private ContactInfoRepository contactInfoRepository;
    
    @Override
    protected ContactInfoRepository getRepository() {
        return contactInfoRepository;
    }

    @Override
    protected AuditableEntity getAuditableEntity(ContactInfo entity) {
        return entity.getContact();
    }
}