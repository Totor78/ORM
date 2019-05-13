package fr.epsi.model;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private Set<Subject> subjects;

    public Teacher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
