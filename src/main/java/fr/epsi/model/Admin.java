package fr.epsi.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="admin")
public class Admin implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "cartebleue")
    private Set<CarteBleue> cartebleues;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Set<CarteBleue> getCartebleues() {
        return cartebleues;
    }

    public void setCartebleues(Set<CarteBleue> cartebleues) {
        this.cartebleues = cartebleues;
    }
}
