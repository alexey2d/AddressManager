package ua.levelup.AddressManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.levelup.AddressManager.model.Address;
import ua.levelup.AddressManager.repository.AddressRepository;
import ua.levelup.AddressManager.service.AddressService;

import java.util.List;

/**
 * Created by java on 15.05.2016.
 */

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository; // only to interface

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.getAll();
    }

    @Override
    public void deleteById(long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Address findById(long id) {
        return addressRepository.findById(id);
    }

    @Override
    public boolean isExist(Address address) {
        return addressRepository.isExist(address);
    }
}
