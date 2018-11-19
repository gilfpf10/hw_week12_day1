import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Joe", 12345, 30000);

        }

        @Test
        public void getName() {
            assertEquals("Joe", developer.getName());

        }

        @Test
        public void getNiNumber() {
            assertEquals(12345, developer.getNiNumber());
        }

        @Test

        public void getSalary() {
            assertEquals(30000, developer.getSalary());

        }


        @Test
        public void canChangeSalary(){
            developer.setSalary(31000);
            assertEquals(31000, developer.getSalary());

        }

        @Test
        public void IncreaseSalary(){
            developer.increaseSalary();
            assertEquals(31000, developer.getSalary());
        }

        @Test
        public void canPayBonus(){
            developer.payBonus();
            assertEquals(300, developer.payBonus());

        }


    }
