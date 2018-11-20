/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claus
 */
public class MemberTest {
    
    public MemberTest() {
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
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Member.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Member instance = null;
        instance.setName(Name);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Member.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Member instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Member.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int Age = 0;
        Member instance = null;
        instance.setAge(Age);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Member.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Member instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Member.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 0;
        Member instance = null;
        instance.setId(Id);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Member instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
