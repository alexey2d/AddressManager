package ua.levelup.AddressManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.levelup.AddressManager.model.Phone;
import ua.levelup.AddressManager.repository.PhoneRepository;
import ua.levelup.AddressManager.service.PhoneService;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public void save(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public List<Phone> getAll() {
        return phoneRepository.getAll();
    }

    @Override
    public Phone findById(long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public boolean isExist(Phone address) {
        return phoneRepository.isExist(address);
    }

    @Override
    public boolean isExist(String number) {
        return phoneRepository.isExist(number);
    }
}
