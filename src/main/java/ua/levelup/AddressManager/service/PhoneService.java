package ua.levelup.AddressManager.service;

import ua.levelup.AddressManager.model.Phone;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public interface PhoneService {
    void save(Phone phone);
    List<Phone> getAll();
    Phone findById(long id);
    void deleteById(long id);
    boolean isExist(Phone address);
}
