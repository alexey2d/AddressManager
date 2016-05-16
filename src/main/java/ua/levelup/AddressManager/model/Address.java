package ua.levelup.AddressManager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Created by java on 11.05.2016.
 */

@Entity
@Table(name = "Address")
@NamedQuery(name = "Address.getAll", query = "SELECT a FROM Address a")
public class Address implements Serializable {
    private long id;
    private String content;
    private List<Phone> phones;

    public Address() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "CONTENT", unique = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address", cascade = CascadeType.ALL, targetEntity = Phone.class) // ссылаться на себя же
    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
