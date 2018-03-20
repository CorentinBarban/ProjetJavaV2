/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author corentin
 */
public class ManageDataTest {
    
    public ManageDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readData method, of class ManageData.
     */
    @Test
    public void testReadData() {
        System.out.println("readData");
        Company c = null;
        ManageData instance = new ManageDataImpl();
        instance.readData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class ManageData.
     */
    @Test
    public void testWriteData() {
        System.out.println("writeData");
        Company c = null;
        ManageData instance = new ManageDataImpl();
        instance.writeData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ManageDataImpl implements ManageData {

        public void readData(Company c) {
        }

        public void writeData(Company c) {
        }
    }
    
}
