package mnm_crm;

/**
 *
 * @author ngarc
 */
public class Customer {
    private String lastName;
    private String firstName;
    private String email;
    private int phoneNum;
    private String address;
    
    //Constructor to set up new customer
    public Customer(String last, String first, String em, int phone, String ad){
        lastName = last;
        firstName = first;
        email = em;
        phoneNum = phone;
        address = ad;
    }
    
    //prints customer's info in one line
    public void printCustomer(){
        System.out.println(lastName + ", " + firstName + "\t" + email + "\t" + phoneNum + "\t" + address);
    }
    
    
    //getter methods
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getPhoneNum(){
        return phoneNum;
    }
    
    public String getAddress(){
        return address;
    }
    
}
