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
 * @author Claus
 */
public class AllMembersTest {
    
    public AllMembersTest() {
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
     * Test of createMember method, of class AllMembers.
     */
    @Test
    public void testCreateMember() {
        System.out.println("createMember");
        String name = "Karl Johansen";
        int age = 17;
        int id = 1;
        boolean aktiv = true;
        String aktivTekst = "Ja";
        String jES = "Junior";
        String konSvøm = "Ja";
        AllMembers instance = new AllMembers();
        Member expResult = null;
        Member result = instance.createMember(name, age, id, aktiv, aktivTekst, jES, konSvøm);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMember method, of class AllMembers.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Member member = null;
        AllMembers instance = new AllMembers();
        instance.addMember(member);
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAllMembers method, of class AllMembers.
     */
    @Test
    public void testShowAllMembers() {
        System.out.println("showAllMembers");
        AllMembers instance = new AllMembers();
        List<Member> expResult = null;
        List<Member> result = instance.showAllMembers();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
