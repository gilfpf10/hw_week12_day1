import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Joe", 12345, 30000);

    }

    @Test
    public void getName() {
        assertEquals("Joe", manager.getName());

    }

    @Test
    public void getNiNumber() {
        assertEquals(12345, manager.getNiNumber());
    }

    @Test

    public void getSalary() {
        assertEquals(30000, manager.getSalary());

    }


    @Test
    public void canChangeSalary(){
        manager.setSalary(31000);
        assertEquals(31000, manager.getSalary());

    }

    @Test
    public void IncreaseSalary(){
        manager.increaseSalary();
        assertEquals(31000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(300, manager.payBonus());

    }


}

