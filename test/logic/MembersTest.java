/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hanne
 */
public class MembersTest {
    private Members c;
    
    public MembersTest() {
        Members data = new Members(Name, 0, 0)
         
        
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
     * Test of getName method, of class Members.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Members instance = new Members;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Members.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Members instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Members.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Members instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Members.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int Age = 0;
        Members instance = null;
        instance.setAge(Age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Members.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Members instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Members.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Members instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Members.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Members instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMember method, of class Members.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Members instance = null;
        instance.addMember();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMember method, of class Members.
     */
    @Test
    public void testShowMember() {
        System.out.println("showMember");
        Members instance = null;
        String expResult = "";
        String result = instance.showMember();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of write method, of class Members.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        List<List> ListOfMembers = null;
        Members instance = null;
        instance.write(ListOfMembers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readObject method, of class Members.
     */
    @Test
    public void testReadObject() {
        System.out.println("readObject");
        Members instance = null;
        List<List> expResult = null;
        List<List> result = instance.readObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
