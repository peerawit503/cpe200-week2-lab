import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 24/8/2559.
 */
public class GPATest {
    GPA gpa;
    @Before
    public void setUp() throws Exception {
        gpa = new GPA();
    }

    @Test
    public void singleClass() throws Exception {
        gpa.addGrade(4, 4);
        assertEquals(4.0f, gpa.get(), 0);
    }

    @Test
    public void multipleClassesSingleGrade() throws Exception {
        gpa.addGrade(4, 4);
        gpa.addGrade(3, 4);
        assertEquals(4.0f, gpa.get(), 0);
    }

    @Test
    public void multipleClassesMultipleGrade() throws Exception {
        gpa.addGrade(4, 4);
        gpa.addGrade(3, 4);
        gpa.addGrade(4, 3);
        gpa.addGrade(3, 3);
        assertEquals(3.5f, gpa.get(), 0.01);
    }


    @Test
    public void multipleClassesWithZeroGrade() throws Exception {
        gpa.addGrade(4, 0);
        gpa.addGrade(3, 1);
        gpa.addGrade(4, 2);
        gpa.addGrade(3, 3);
        assertEquals(1.42f, gpa.get(), 0.01);
    }

    @Test
    public void multipleClassesAllZeroGrade() throws Exception {
        gpa.addGrade(4, 0);
        gpa.addGrade(3, 0);
        gpa.addGrade(4, 0);
        gpa.addGrade(3, 0);
        assertEquals(0f, gpa.get(), 0);
    }

    @Test
    public void noClass() throws Exception {
        assertEquals(0f, gpa.get(), 0);
    }
}