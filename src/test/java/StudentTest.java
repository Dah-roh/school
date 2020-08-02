import model.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void checkFields() {
        Student tester = new Student(); // Student is tested
        tester.setId(1);
        tester.setFirstName("Fredrick");
        tester.setStudentClass("JSS 3");
        int id = 1;
        String testfirstName = "Fredrick";
        String testClass = "JSS 3";
        int studentId = tester.getId();
        // assert statements
        assertEquals(studentId, 1);
        assertEquals(tester.getFirstName(), testfirstName);
        assertEquals(tester.getStudentClass(), testClass);
    
    }
}