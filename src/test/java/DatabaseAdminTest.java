import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Kay", 54321, 30000);

    }

    @Test
    public void getName() {
        assertEquals("Kay", databaseAdmin.getName());

    }

    @Test
    public void getNiNumber() {
        assertEquals(54321, databaseAdmin.getNiNumber());
    }

    @Test

    public void getSalary() {
        assertEquals(30000, databaseAdmin.getSalary());

    }


    @Test
    public void canChangeSalary(){
        databaseAdmin.setSalary(31000);
        assertEquals(31000, databaseAdmin.getSalary());

    }

    @Test
    public void IncreaseSalary(){
        databaseAdmin.increaseSalary();
        assertEquals(31000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(300, databaseAdmin.payBonus());

    }


}
