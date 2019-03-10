/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnm_crm;

/**
 *
 * @author ngarc
 */
public class Employee {
    private String lastName;
    private String firstName;
    private String email;
    private int phoneNum;
    private int id;
    
    //Constructor to set up new customer
    public Employee(String last, String first, String em, int phone, int idNum){
        lastName = last;
        firstName = first;
        email = em;
        phoneNum = phone;
        id = idNum;
    }
    
    //prints employee's info in one line
    public void printCustomer(){
        System.out.println(lastName + ", " + firstName + "\t" + email + "\t" + phoneNum + "\t" + id);
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
    
    public int getId(){
        return id;
    }
    
}
