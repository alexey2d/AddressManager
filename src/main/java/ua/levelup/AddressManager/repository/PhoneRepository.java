package ua.levelup.AddressManager.repository;

import ua.levelup.AddressManager.model.Phone;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public interface PhoneRepository {
    void save(Phone phone);
    List<Phone> getAll();
    Phone findById(long id);
    void deleteById(long id);
    boolean isExist(Phone address);
    boolean isExist(String number);
}
