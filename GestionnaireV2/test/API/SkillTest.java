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
public class SkillTest {
    
    public SkillTest() {
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
     * Test of getId method, of class Skill.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Skill instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Skill.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String idSkill = "";
        Skill instance = null;
        instance.setId(idSkill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillNameFr method, of class Skill.
     */
    @Test
    public void testGetSkillNameFr() {
        System.out.println("getSkillNameFr");
        Skill instance = null;
        String expResult = "";
        String result = instance.getSkillNameFr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillNameFr method, of class Skill.
     */
    @Test
    public void testSetSkillNameFr() {
        System.out.println("setSkillNameFr");
        String skillNameFr = "";
        Skill instance = null;
        instance.setSkillNameFr(skillNameFr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillNameEn method, of class Skill.
     */
    @Test
    public void testGetSkillNameEn() {
        System.out.println("getSkillNameEn");
        Skill instance = null;
        String expResult = "";
        String result = instance.getSkillNameEn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillNameEn method, of class Skill.
     */
    @Test
    public void testSetSkillNameEn() {
        System.out.println("setSkillNameEn");
        String skillNameEn = "";
        Skill instance = null;
        instance.setSkillNameEn(skillNameEn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Skill.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Skill instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
