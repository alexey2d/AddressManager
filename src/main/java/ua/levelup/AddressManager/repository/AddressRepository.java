package ua.levelup.AddressManager.repository;

import ua.levelup.AddressManager.model.Address;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */
public interface AddressRepository {
    void save(Address address);
//    Address update(Address address); //not needed
    List<Address> getAll();
    void deleteById(long id);
    Address findById(long id);
    boolean isExist(Address address);
    boolean isExist(String content);
}
