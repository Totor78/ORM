package fr.epsi.model;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="cartebleue",uniqueConstraints = {@UniqueConstraint(columnNames = "Pan")},
        indexes = @Index(columnList = "Pan"))
public class CarteBleue {

    private String Pan;
    @ManyToOne
    private User admin;
    private Date validite;
    private int cryptogramme;




    public String getPan() {
        return Pan;
    }

    public void setPan(String pan) {
        Pan = pan;
    }


    public Date getValidite() {
        return validite;
    }

    public void setValidite(Date validite) {
        this.validite = validite;
    }

    public int getCryptogramme() {
        return cryptogramme;
    }

    public void setCryptogramme(int cryptogramme) {
        this.cryptogramme = cryptogramme;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
}
