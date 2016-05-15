package ua.levelup.AddressManager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import ua.levelup.AddressManager.model.Address;
import ua.levelup.AddressManager.repository.AddressRepository;


import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by java on 15.05.2016.
 */

@Repository
@Transactional // надо ставить, иначе не будет генериться айди
public class AddressRepositoryImpl implements AddressRepository {
    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    public void save(Address address) {
        hibernateTemplate.saveOrUpdate(address);
    }

//    @Override
//    public Address update(Address address) {
//        return null;
//    }

    @Override
    public List<Address> getAll() {
        return (List<Address>) hibernateTemplate.find("FROM Address");
    }

    @Override
    public Address findById(long id) {
        return hibernateTemplate.get(Address.class, id);
    }

    @Override
    public void deleteById(long id) {
        hibernateTemplate.delete(findById(id));
    }

    @Override
    public boolean isExist(Address address) {
        return findById(address.getId()) == null ? false : true;
    }
}
