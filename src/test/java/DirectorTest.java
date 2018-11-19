import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("JD", 12345, 40000, 200000);
    }

        @Test
        public void getName() {
            assertEquals("JD", director.getName());

        }

        @Test
        public void getNiNumber() {
            assertEquals(12345, director.getNiNumber());
        }

        @Test

        public void getSalary() {
            assertEquals(40000, director.getSalary());

        }


        @Test
        public void canChangeSalary(){
            director.setSalary(31000);
            assertEquals(31000, director.getSalary());

        }

        @Test
        public void IncreaseSalary(){
            director.increaseSalary();
            assertEquals(41000, director.getSalary());
        }

        @Test
        public void canPayBonus(){
            director.payBonus();
            assertEquals(400, director.payBonus());

        }

        @Test
    public void getbudget(){
        director.getBudget();
        assertEquals(200000.0, director.getBudget());
        }


    }


