/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.User;

/**
 *
 * @author asus
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String uName = "";
        String uPass = "";
        DAOLogin instance = new DAOLogin();
        List<User> expResult = null;
        List<User> result = instance.getBy(uName, uPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
