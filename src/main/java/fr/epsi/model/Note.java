package fr.epsi.model;


import javax.persistence.*;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue
    private long id;
    private long value;
    @ManyToOne
    private User user;
    @ManyToOne
    private Message message;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
