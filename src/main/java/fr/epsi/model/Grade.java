package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

public class Grade {

    @Id
    @GeneratedValue
    private long id;
    private Integer value;
    private Date date;
    @ManyToOne
    private int Student_id;
    @ManyToOne
    private int Subject_id;
    @ManyToOne
    private int Teacher_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date lastname) {
        this.date = date;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public int getSubject_id() {
        return Subject_id;
    }

    public void setSubject_id(int subject_id) {
        Subject_id = subject_id;
    }

    public int getTeacher_id() {
        return Teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        Teacher_id = teacher_id;
    }
}
