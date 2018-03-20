/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import API.Company;
import API.Requirement;
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
public class ManageMissionTest {
    
    public ManageMissionTest() {
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
     * Test of checkNbPersonRequiredSkill method, of class ManageMission.
     */
    @Test
    public void testCheckNbPersonRequiredSkill() {
        System.out.println("checkNbPersonRequiredSkill");
        Requirement r = null;
        ManageMission instance = new ManageMission();
        boolean expResult = false;
        boolean result = instance.checkNbPersonRequiredSkill(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skillCheck method, of class ManageMission.
     */
    @Test
    public void testSkillCheck() {
        System.out.println("skillCheck");
        ManageMission instance = new ManageMission();
        instance.skillCheck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readData method, of class ManageMission.
     */
    @Test
    public void testReadData() {
        System.out.println("readData");
        Company c = null;
        ManageMission instance = new ManageMission();
        instance.readData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeData method, of class ManageMission.
     */
    @Test
    public void testWriteData() {
        System.out.println("writeData");
        Company c = null;
        ManageMission instance = new ManageMission();
        instance.writeData(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
