/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

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
public class CompanyTest {
    
    public CompanyTest() {
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
     * Test of addMission method, of class Company.
     */
    @Test
    public void testAddMission() {
        System.out.println("addMission");
        Mission m = null;
        Company instance = null;
        instance.addMission(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Company.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person p = null;
        Company instance = null;
        instance.addPerson(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSkill method, of class Company.
     */
    @Test
    public void testAddSkill() {
        System.out.println("addSkill");
        Skill s = null;
        Company instance = null;
        instance.addSkill(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySkills method, of class Company.
     */
    @Test
    public void testDisplaySkills() {
        System.out.println("displaySkills");
        Company instance = null;
        instance.displaySkills();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPerson method, of class Company.
     */
    @Test
    public void testDisplayPerson() {
        System.out.println("displayPerson");
        Company instance = null;
        instance.displayPerson();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMissions method, of class Company.
     */
    @Test
    public void testDisplayMissions() {
        System.out.println("displayMissions");
        Company instance = null;
        instance.displayMissions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
