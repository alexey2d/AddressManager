package ua.levelup.AddressManager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import ua.levelup.AddressManager.model.Phone;
import ua.levelup.AddressManager.repository.PhoneRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by java on 15.05.2016.
 */

@Repository
@Transactional // надо ставить, иначе не будет генериться айди
public class PhoneRepositoryImpl implements PhoneRepository{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Phone phone) {
        hibernateTemplate.saveOrUpdate(phone);
    }

    @Override
    public List<Phone> getAll() {
        return (List<Phone>) hibernateTemplate.find("FROM Phone");
    }

    @Override
    public Phone findById(long id) {
        return hibernateTemplate.get(Phone.class, id);
    }

    @Override
    public void deleteById(long id) {
        hibernateTemplate.delete(findById(id));
    }

    @Override
    public boolean isExist(Phone phone) {
        return findById(phone.getId()) == null ? false : true;
    }

    @Override
    public boolean isExist(String number) {
        Phone phone = (Phone) hibernateTemplate.find("FROM Phone p WHERE p.number = ?", number);
        return phone == null ? false : true;
    }
}
