package fr.epsi.dao;

import fr.epsi.model.Subject;
import org.junit.Test;

public class SubjectDaoTest {

    @Test
    public void insertSubject() {
        Subject subject = new Subject();
        subject.setLieblle("Anglais");
        System.out.println(new SubjectDao().save(subject));

    }

    @Test
    public void getSubject() {
        Subject subject = new SubjectDao().get(11);
        System.out.println(subject.getLibelle());
    }
}
