package ua.levelup.AddressManager.model;

import javax.persistence.*;

/**
 * Created by java on 11.05.2016.
 */
@Entity
@Table(name = "phones")
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

    @Column(name = "PHONE")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID", nullable = false)
    public Address getAddress() {
        return address;
    }
}

