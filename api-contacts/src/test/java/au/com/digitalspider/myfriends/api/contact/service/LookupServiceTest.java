package au.com.digitalspider.myfriends.api.contact.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import au.com.digitalspider.myfriends.api.contact.model.Lookup;

public class LookupServiceTest {
    private LookupService lookupService = new LookupService();

    @Test
    public void testFindByTypeStatus() {
        List<?> statusList = lookupService.findByType(Lookup.STATUS);
        System.out.println("statusList="+statusList);
        Assert.assertEquals(4, statusList.size());
        List<?> stateList = lookupService.findByType(Lookup.STATE);
        System.out.println("stateList="+stateList);
        Assert.assertEquals(7, stateList.size());
        List<?> countryList = lookupService.findByType(Lookup.COUNTRY);
        System.out.println("countryList="+countryList);
        Assert.assertEquals(1, countryList.size());
        List<?> infoTypeList = lookupService.findByType(Lookup.INFOTYPE);
        System.out.println("infoTypeList="+infoTypeList);
        Assert.assertEquals(11, infoTypeList.size());

    }
}