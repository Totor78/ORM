package fr.epsi.dao;
import fr.epsi.model.Subject;
import fr.epsi.model.Teacher;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class TeacherDaoTest {

    @Test
    public void insertTeacher() {

        Teacher teacher = new Teacher();
        teacher.setFirstname("Antoine");
        teacher.setLastname("Declide");
        Subject sub = new Subject();
        sub.setLibelle("Anglais");
        sub.setTeacher(teacher);
        teacher.setSubjects(new HashSet<>(Arrays.asList(sub)));
        System.out.println(new TeacherDao().save(teacher));
    }

    @Test
    public void getTeacher() {
        Teacher u = new TeacherDao().get(1);
        System.out.println(u.getFirstname());
    }
}
