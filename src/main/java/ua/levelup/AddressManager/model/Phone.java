package ua.levelup.AddressManager.model;

import javax.persistence.*;

/**
 * Created by java on 11.05.2016.
 */
@Entity
@Table(name = "Phone")
@NamedQuery(name = "Phone.getAll", query = "SELECT p FROM Phone p")
public class Phone {
    private long id;
    private String phoneNumber;
    private Address address;


    public Phone() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PHONE_ID", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "NUMBER")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID", nullable = false)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

