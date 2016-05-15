package ua.levelup.AddressManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.levelup.AddressManager.model.Phone;
import ua.levelup.AddressManager.service.PhoneService;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public class PhoneServiceImpl implements PhoneService {
    @Autowired PhoneService phoneService;

    @Override
    public void save(Phone phone) {
        phoneService.save(phone);
    }

    @Override
    public List<Phone> getAll() {
        return phoneService.getAll();
    }

    @Override
    public Phone findById(long id) {
        return phoneService.findById(id);
    }

    @Override
    public void deleteById(long id) {
        phoneService.deleteById(id);
    }

    @Override
    public boolean isExist(Phone address) {
        return phoneService.isExist(address);
    }
}
