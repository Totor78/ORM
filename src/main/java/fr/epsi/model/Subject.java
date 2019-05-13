package fr.epsi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {


    @Id
    @GeneratedValue
    private long id;
    private String libelle;
    @ManyToOne
    private Teacher teacher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String firstname) {
        this.libelle = firstname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
