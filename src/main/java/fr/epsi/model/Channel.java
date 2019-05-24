package fr.epsi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "channel",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")},
        indexes = @Index(columnList = "name"))
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    private String type;
    @OneToMany(mappedBy = "user")
    private Set<User> users;

    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL)
    private Set<Message> messages;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "participant", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "participant_id")})
    private List<User> participant;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public List<User> getParticipant() {
        return participant;
    }

    public void setParticipant(List<User> participant) {
        this.participant = participant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
