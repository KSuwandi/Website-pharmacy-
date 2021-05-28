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
public class StockTest {
    
    public StockTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdstk method, of class Stock.
     */
    @Test
    public void testGetIdstk() {
        System.out.println("1. getIdstk");
        Stock instance = new Stock();
        Integer expResult = 1;
        instance.setIdstk(1);
        Integer result = instance.getIdstk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdstk method, of class Stock.
     */
    @Test
    public void testSetIdstk() {
        System.out.println("2.setIdstk");
        Integer idstk = null;
        Stock instance = new Stock();
        instance.setIdstk(idstk);
        assertEquals(instance.getIdstk(), idstk);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNamastock method, of class Stock.
     */
    @Test
    public void testGetNamastock() {
        System.out.println("3. getNamastock");
        Stock instance = new Stock();
        String expResult = "nama barang";
        instance.setNamastock("nama barang");
        String result = instance.getNamastock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNamastock method, of class Stock.
     */
    @Test
    public void testSetNamastock() {
        System.out.println("setNamastock");
        String namastock = "nama barang";
        Stock instance = new Stock();
        instance.setNamastock(namastock);
        assertEquals(instance.getNamastock(), namastock);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTypestock method, of class Stock.
     */
    @Test
    public void testGetTypestock() {
        System.out.println("getTypestock");
        Stock instance = new Stock();
        String expResult = "Staple";
        instance.setTypestock("Staple");
        String result = instance.getTypestock();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTypestock method, of class Stock.
     */
    @Test
    public void testSetTypestock() {
        System.out.println("setTypestock");
        String typestock = "Staple";
        Stock instance = new Stock();
        instance.setTypestock(typestock);
        assertEquals(instance.getTypestock(), typestock);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPricestock method, of class Stock.
     */
    @Test
    public void testGetPricestock() {
        System.out.println("getPricestock");
        Stock instance = new Stock();
        String expResult = "Rp10000";
        instance.setPricestock("Rp10000");
        String result = instance.getPricestock();
        assertEquals(expResult, result);
        assertThat(expResult, startsWith("Rp"));
        assertThat(expResult, endsWith("00"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPricestock method, of class Stock.
     */
    @Test
    public void testSetPricestock() {
        System.out.println("setPricestock");
        String pricestock = "Rp10000";
        Stock instance = new Stock();
        instance.setPricestock(pricestock);
        assertEquals(instance.getPricestock(), pricestock);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJmlstock method, of class Stock.
     */
    @Test
    public void testGetJmlstock() {
        System.out.println("getJmlstock");
        Stock instance = new Stock();
        String expResult = "100";
        instance.setJmlstock("100");
        String result = instance.getJmlstock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJmlstock method, of class Stock.
     */
    @Test
    public void testSetJmlstock() {
        System.out.println("setJmlstock");
        String jmlstock = "100";
        Stock instance = new Stock();
        instance.setJmlstock(jmlstock);
        assertEquals(instance.getJmlstock(), jmlstock);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExpstock method, of class Stock.
     */
    @Test
    public void testGetExpstock() {
        System.out.println("getExpstock");
        Stock instance = new Stock();
        String expResult = "12/12/2019";
        instance.setExpstock("12/12/2019");
        String result = instance.getExpstock();
        assertEquals(expResult, result);
        assertThat(expResult, containsString("/") );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setExpstock method, of class Stock.
     */
    @Test
    public void testSetExpstock() {
        System.out.println("setExpstock");
        String expstock = "12/12/2019";
        Stock instance = new Stock();
        instance.setExpstock(expstock);
        assertEquals(instance.getExpstock(), expstock);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getbyID method, of class Stock.
     */
}
