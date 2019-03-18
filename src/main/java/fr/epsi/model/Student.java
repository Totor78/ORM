package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String classroom;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }



}
