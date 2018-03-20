/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author corentin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Management.ManageDataTest.class, Management.ManageMissionTest.class, Management.XMLPersonHandlerTest.class, Management.TestsTest.class, Management.ManagePersonTest.class, Management.ManageSkillTest.class, Management.XMLMissionHandlerTest.class, Management.XMLSkillHandlerTest.class})
public class ManagementSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
