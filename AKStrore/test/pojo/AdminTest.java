/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author asus
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdadm method, of class Admin.
     */
    @Test
    public void testGetIdadm() {
        System.out.println("1. getIdadm  test run");
        
        Admin a = new Admin();        
        Integer exp = 1;
        a.setIdadm(1);
        Integer result = a.getIdadm();
        assertEquals(exp, result);
        assertThat(exp, is(notNullValue()));                
    }

    /**
     * Test of setIdadm method, of class Admin.
     */
    
    @Test
    public void testSetIdadm() {
        System.out.println("2. setIdadm test run");
        Integer idadm = 1;
        Admin a = new Admin();
        a.setIdadm(idadm);
        assertEquals(a.getIdadm(), idadm);
    }

    /**
     * Test of getUseradm method, of class Admin.
     */
    
    @Test
    public void testGetUseradm() {
        System.out.println("3. getUseradm test run");
        Admin a = new Admin();
        String exp = "Aerunisa7";
        a.setUseradm("Aerunisa7");
        String result = a.getUseradm();
        assertEquals(exp, result);
        assertThat(exp, is(notNullValue()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUseradm method, of class Admin.
     */
    
    @Test
    public void testSetUseradm() {
        System.out.println("4. setUseradm test run");
        String useradm = "Aerunisa7";
        Admin a = new Admin();
        a.setUseradm(useradm);
        assertEquals(a.getUseradm(), useradm);
    }

    /**
     * Test of getEmailadm method, of class Admin.
     */
    
    @Test
    public void testGetEmailadm() {
        System.out.println("5. getEmailadm test run");
        Admin a = new Admin();
        String exp = "aerunisa@gmail.com";
        a.setEmailadm("aerunisa@gmail.com");
        String result = a.getEmailadm();
        assertEquals(exp, result);
        assertThat(exp, allOf(endsWith(".com"),containsString("@"),startsWith("a") ));
        assertThat(Arrays.asList("a","e","i","u","o"),hasItem("a"));
    }

    /**
     * Test of setEmailadm method, of class Admin.
     */
    
    @Test
    public void testSetEmailadm() {
        System.out.println("6. setEmailadm test run");
        String emailadm = "aerunisa@gmail.com";
        Admin a = new Admin();
        a.setEmailadm(emailadm);
        assertEquals(a.getEmailadm(), emailadm);             
    }

    /**
     * Test of getPassadm method, of class Admin.
     */    
    @Test
    public void testGetPassadm() {
        System.out.println("7.getPassadm test run");
        Admin a = new Admin();
        String exp = "Aerunisa9";
        a.setPassadm("Aerunisa9");
        String result = a.getPassadm();
        assertEquals(exp, result);
        
    }

    /**
     * Test of setPassadm method, of class Admin.
     */    
    @Test
    public void testSetPassadm() {
        System.out.println("8. setPassadm test run");
        String passadm = "Aerunisa9";
        Admin a = new Admin();
        a.setPassadm(passadm);
        assertEquals(a.getPassadm(), passadm);
    }

    /**
     * Test of update method, of class Admin.
     */   
    
}
