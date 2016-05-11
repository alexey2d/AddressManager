package ua.levelup.AddressManager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Created by java on 11.05.2016.
 */

@Entity
@Table(name = "Address")
public class Address implements Serializable {
    private long id;
    private String content;
    private List<Phone> phones;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "phones")
    public List<Phone> getPhones() {
        return phones;
    }
}
