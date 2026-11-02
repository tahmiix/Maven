import junit.framework.TestCase;
import org.codewiththamsanqa.Student;
import org.codewiththamsanqa.StudentService;

import java.util.List;

public class StudentServiceTest extends TestCase {

    public void testGetStudents() {
        StudentService ss = new StudentService();
        Student s = new Student(1333,"Thamsanqa");
        Student s1 = new Student(222,"Gift");

        ss.addStudent(s);

       // boolean isExist = ss.getStudents().contains(s1);
        boolean isExist = ss.getStudents().isEmpty();

        assertTrue(isExist);
    }
}