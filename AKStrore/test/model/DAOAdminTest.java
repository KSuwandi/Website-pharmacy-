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
import pojo.Admin;

/**
 *
 * @author asus
 */
public class DAOAdminTest {
    
    public DAOAdminTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of NewAdmin method, of class DAOAdmin.
     */
    @Test
    public void testNewAdmin() {
        System.out.println("NewAdmin");
        Admin adm = null;
        DAOAdmin instance = new DAOAdmin();
        instance.NewAdmin(adm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAdmin method, of class DAOAdmin.
     */
    @Test
    public void testUpdateAdmin() {
        System.out.println("updateAdmin");
        Admin adm = null;
        DAOAdmin instance = new DAOAdmin();
        instance.updateAdmin(adm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAdmin method, of class DAOAdmin.
     */
    @Test
    public void testDeleteAdmin() {
        System.out.println("deleteAdmin");
        int ida = 0;
        DAOAdmin instance = new DAOAdmin();
        instance.deleteAdmin(ida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdmin method, of class DAOAdmin.
     */
    @Test
    public void testGetAdmin() {
        System.out.println("getAdmin");
        int ida = 0;
        DAOAdmin instance = new DAOAdmin();
        List<Admin> expResult = null;
        List<Admin> result = instance.getAdmin(ida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieviewAdmin method, of class DAOAdmin.
     */
    @Test
    public void testRetrieviewAdmin() {
        System.out.println("retrieviewAdmin");
        DAOAdmin instance = new DAOAdmin();
        List<Admin> expResult = null;
        List<Admin> result = instance.retrieviewAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAdmin method, of class DAOAdmin.
     */
    @Test
    public void testRetrieveAdmin() {
        System.out.println("retrieveAdmin");
        DAOAdmin instance = new DAOAdmin();
        List<Admin> expResult = null;
        List<Admin> result = instance.retrieveAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
