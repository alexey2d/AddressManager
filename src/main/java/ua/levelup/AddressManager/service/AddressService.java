package ua.levelup.AddressManager.service;

import ua.levelup.AddressManager.model.Address;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public interface AddressService {
    void save(Address address);
    List<Address> getAll();
    void deleteById(long id);
    Address findById(long id);
    boolean isExist(Address address);
    boolean isExist(String content);
}
