/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.hamcrest.core.IsAnything;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Admin;

/**
 *
 * @author asus
 */
public class DAOAdmLoginTest {
    
    public DAOAdmLoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOAdmLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String aName = "test";
        String aEmail = "test";
        String aPass = "test";
        DAOAdmLogin instance = new DAOAdmLogin();        
        List<Admin> result = instance.getBy(aName, aEmail, aPass);        
        assertThat(result,IsAnything.anything());
        assertThat(result,is(notNullValue()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
