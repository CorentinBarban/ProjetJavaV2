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
public class ManageSkillTest {
    
    public ManageSkillTest() {
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
     * Test of readData method, of class ManageSkill.
     */
    @Test
    public void testReadData() {
        System.out.println("readData");
        Company c = null;
        ManageSkill instance = new ManageSkill();
        instance.readData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class ManageSkill.
     */
    @Test
    public void testWriteData() {
        System.out.println("writeData");
        Company c = null;
        ManageSkill instance = new ManageSkill();
        instance.writeData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
