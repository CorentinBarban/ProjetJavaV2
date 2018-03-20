/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.Date;
import java.util.HashMap;
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
public class MissionTest {
    
    public MissionTest() {
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
     * Test of getEtat method, of class Mission.
     */
    @Test
    public void testGetEtat() {
        System.out.println("getEtat");
        Mission instance = null;
        Mission.Etat expResult = null;
        Mission.Etat result = instance.getEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtat method, of class Mission.
     */
    @Test
    public void testSetEtat() {
        System.out.println("setEtat");
        Mission.Etat e = null;
        Mission instance = null;
        instance.setEtat(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMission method, of class Mission.
     */
    @Test
    public void testGetIdMission() {
        System.out.println("getIdMission");
        Mission instance = null;
        int expResult = 0;
        int result = instance.getIdMission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRequirement method, of class Mission.
     */
    @Test
    public void testAddRequirement() {
        System.out.println("addRequirement");
        Requirement r = null;
        Mission instance = null;
        instance.addRequirement(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Mission.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person p = null;
        Mission instance = null;
        instance.addPerson(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMissionName method, of class Mission.
     */
    @Test
    public void testGetMissionName() {
        System.out.println("getMissionName");
        Mission instance = null;
        String expResult = "";
        String result = instance.getMissionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMissionName method, of class Mission.
     */
    @Test
    public void testSetMissionName() {
        System.out.println("setMissionName");
        String missionName = "";
        Mission instance = null;
        instance.setMissionName(missionName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Mission.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Mission instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Mission.
     */
    @Test
    public void testSetStartDate() throws Exception {
        System.out.println("setStartDate");
        String startDate = "";
        Mission instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMissionDuration method, of class Mission.
     */
    @Test
    public void testGetMissionDuration() {
        System.out.println("getMissionDuration");
        Mission instance = null;
        int expResult = 0;
        int result = instance.getMissionDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMissionDuration method, of class Mission.
     */
    @Test
    public void testSetMissionDuration() {
        System.out.println("setMissionDuration");
        int missionDuration = 0;
        Mission instance = null;
        instance.setMissionDuration(missionDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbTotalPerson method, of class Mission.
     */
    @Test
    public void testGetNbTotalPerson() {
        System.out.println("getNbTotalPerson");
        Mission instance = null;
        int expResult = 0;
        int result = instance.getNbTotalPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbTotalPerson method, of class Mission.
     */
    @Test
    public void testSetNbTotalPerson() {
        System.out.println("setNbTotalPerson");
        int nbTotalPerson = 0;
        Mission instance = null;
        instance.setNbTotalPerson(nbTotalPerson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequirements method, of class Mission.
     */
    @Test
    public void testGetRequirements() {
        System.out.println("getRequirements");
        Mission instance = null;
        HashMap<Integer, Requirement> expResult = null;
        HashMap<Integer, Requirement> result = instance.getRequirements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonOnMission method, of class Mission.
     */
    @Test
    public void testGetPersonOnMission() {
        System.out.println("getPersonOnMission");
        Mission instance = null;
        HashMap<String, Person> expResult = null;
        HashMap<String, Person> result = instance.getPersonOnMission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mission.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mission instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
