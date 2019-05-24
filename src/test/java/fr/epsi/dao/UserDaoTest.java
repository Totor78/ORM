package fr.epsi.dao;
import fr.epsi.model.User;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.PersistenceException;
import java.util.Date;

public class UserDaoTest {

    @Test
    public void insertUser() {
        User user = new User();
        user.setEmail("Benjamin@tourman.fr");
        user.setPseudo("Tourman");
        user.setMdp("123456");
        System.out.println(new UserDao().save(user));
    }

    @Test
    public void getUser() {
        User u = new UserDao().get(1);
        System.out.println(u.getPseudo());
    }


    @Test(expected = PersistenceException.class)
    public void uniqueEmailFail() {
        User user1 = new User();
        user1.setPseudo("Ben");
        user1.setMdp("Tourman");
        user1.setEmail("ben@tatou.co");
        user1.setMdp("123456");

        User user2 = new User();
        user2.setPseudo("Benjamin");
        user2.setMdp("Tourman");
        user2.setEmail("ben@tatou.co");
        user2.setMdp("123456");

        new UserDao().save(user1);
        new UserDao().save(user2);
    }

    @Test
    public void uniqueEmailSuccess() {
        User user1 = new User();
        user1.setPseudo("Ben");
        user1.setMdp("Tourman");
        user1.setEmail("ben@tatou.co");
        user1.setMdp("123456");

        User user2 = new User();
        user2.setPseudo("Benjamin");
        user2.setMdp("Tourman");
        user2.setEmail("Benjamin@epsi.fr");
        user2.setMdp("123456");

        new UserDao().save(user1);
        new UserDao().save(user2);
    }



}
