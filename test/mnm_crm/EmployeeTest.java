package mnm_crm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngarc
 */
public class EmployeeTest {
    
    Employee emp1;
    
    @Before
    public void initialize(){
        emp1 = new Employee("Doe", "Jane", "someEmail@somewebsite.com", "(123)456-7890", 123);
        emp1.printCustomer();
    }
    
    @Test
    public void testLastName() {
        assertEquals("Doe", emp1.getLastName());
    }
    
    @Test
    public void testFirstName() {
        assertEquals("Jane", emp1.getFirstName());
    }
    
    @Test
    public void testEmail() {
        assertEquals("someEmail@somewebsite.com", emp1.getEmail());
    }
    
    @Test
    public void testPhoneNum() {
        assertEquals("(123)456-7890", emp1.getPhoneNum());
    }
    
    @Test
    public void testId() {
        assertEquals(123, emp1.getId());
    }
}
