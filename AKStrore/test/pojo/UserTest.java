/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIduser method, of class User.
     */
    @Test
    public void testGetIduser() {
        System.out.println("1. getIduser");
        User a = new User();
        Integer exp = 1;
        a.setIduser(1);
        Integer result = a.getIduser();
        assertEquals(exp, result);
    }

    /**
     * Test of setIduser method, of class User.
     */
    @Test
    public void testSetIduser() {
        System.out.println("2. setIduser");
        Integer iduser = 1;
        User a = new User();        
        a.setIduser(iduser);
        assertEquals(a.getIduser(), iduser);
        
    }

    /**
     * Test of getUsernameu method, of class User.
     */
    @Test
    public void testGetUsernameu() {
        System.out.println("3. getUsernameu");
        User a = new User();
        String exp = "Aerunisa9";
        a.setUsernameu("Aerunisa9");
        String result = a.getUsernameu();
        assertEquals(exp, result);
        assertThat(exp, allOf(endsWith("9"),startsWith("A") ));
    }

    /**
     * Test of setUsernameu method, of class User.
     */
    @Test
    public void testSetUsernameu() {
        System.out.println("4. setUsernameu");
        String usernameu = "Aerunisa9";
        User instance = new User();
        instance.setUsernameu(usernameu);
        assertEquals(instance.getUsernameu(), usernameu);
        
    }

    /**
     * Test of getEmailuse method, of class User.
     */
    @Test
    public void testGetEmailuse() {
        System.out.println("5. getEmailuse");
        User instance = new User();
        String expResult = "Aerunisa@gmail.com";
        instance.setEmailuse("Aerunisa@gmail.com");
        String result = instance.getEmailuse();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith(".com"),containsString("@"),startsWith("A") ));
    }

    /**
     * Test of setEmailuse method, of class User.
     */
    @Test
    public void testSetEmailuse() {
        System.out.println("6.setEmailuse");
        String emailuse = "Aerunisa@gmail.com";
        User instance = new User();
        instance.setEmailuse(emailuse);
        assertEquals(instance.getEmailuse(), emailuse);
        
    }

    /**
     * Test of getPassuser method, of class User.
     */
    @Test
    public void testGetPassuser() {
        System.out.println("7.getPassuser");
        User instance = new User();
        String expResult = "Aerunisaaa";
        instance.setPassuser("Aerunisaaa");
        String result = instance.getPassuser();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith("a"),containsString("a"),startsWith("A") ));
    }

    /**
     * Test of setPassuser method, of class User.
     */
    @Test
    public void testSetPassuser() {
        System.out.println("8.setPassuser");
        String passuser = "Aerunisaaa";
        User instance = new User();
        instance.setPassuser(passuser);
        assertEquals(instance.getPassuser(), passuser);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
