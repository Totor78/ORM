package fr.epsi.dao;

import fr.epsi.model.Subject;
import org.junit.Test;

public class SubjectDaoTest {

    @Test
    public void insertSubject() {
        Subject subject = new Subject();
        subject.setLibelle("Anglais");
        System.out.println(new SubjectDao().save(subject));

    }

    @Test
    public void getSubject() {
        Subject subject = new SubjectDao().get(5);
        System.out.println(subject.getLibelle());
    }
}
