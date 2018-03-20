/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.List;
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
public class RequirementTest {
    
    public RequirementTest() {
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
     * Test of getRequiredSkill method, of class Requirement.
     */
    @Test
    public void testGetRequiredSkill() {
        System.out.println("getRequiredSkill");
        Requirement instance = null;
        Skill expResult = null;
        Skill result = instance.getRequiredSkill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdRequirement method, of class Requirement.
     */
    @Test
    public void testGetIdRequirement() {
        System.out.println("getIdRequirement");
        Requirement instance = null;
        int expResult = 0;
        int result = instance.getIdRequirement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdRequirement method, of class Requirement.
     */
    @Test
    public void testSetIdRequirement() {
        System.out.println("setIdRequirement");
        int idRequirement = 0;
        Requirement instance = null;
        instance.setIdRequirement(idRequirement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListPersonnes method, of class Requirement.
     */
    @Test
    public void testGetListPersonnes() {
        System.out.println("getListPersonnes");
        Requirement instance = null;
        List<Person> expResult = null;
        List<Person> result = instance.getListPersonnes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbTotalPersonnes method, of class Requirement.
     */
    @Test
    public void testGetNbTotalPersonnes() {
        System.out.println("getNbTotalPersonnes");
        Requirement instance = null;
        int expResult = 0;
        int result = instance.getNbTotalPersonnes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbPersonnes method, of class Requirement.
     */
    @Test
    public void testGetNbPersonnes() {
        System.out.println("getNbPersonnes");
        Requirement instance = null;
        int expResult = 0;
        int result = instance.getNbPersonnes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Requirement.
     */
    @Test
    public void testAddPerson() throws Exception {
        System.out.println("addPerson");
        Person p = null;
        Requirement instance = null;
        instance.addPerson(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Requirement.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Requirement instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
