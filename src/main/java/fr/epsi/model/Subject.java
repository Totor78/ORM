package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Subject {

    @Id
    @GeneratedValue
    private long id;
    private String libelle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLieblle(String firstname) {
        this.libelle = firstname;
    }


}
