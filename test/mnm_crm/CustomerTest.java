package mnm_crm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ngarc
 */
public class CustomerTest {
    Customer cust1;
    
    @Before
    public void initialize() {
        cust1 = new Customer("Doe", "John", "someEmail@somewebsite.com", "(123)456-7890", "123 Some Street");
        cust1.printCustomer();
    }
    
    @Test
    public void testLastName() {
        assertEquals("Doe", cust1.getLastName());
    }
    
    @Test
    public void testFirstName() {
        assertEquals("John", cust1.getFirstName());
    }
    
    @Test
    public void testEmail() {
        assertEquals("someEmail@somewebsite.com", cust1.getEmail());
    }
    
    @Test
    public void testPhoneNum() {
        assertEquals("(123)456-7890", cust1.getPhoneNum());
    }
    
    @Test
    public void testAddress() {
        assertEquals("123 Some Street", cust1.getAddress());
    }
}
