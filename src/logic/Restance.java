/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import delfinen.data.ReadWrite;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Restance {
    private Member  a;
    private AllMembers b;
    private static List<Member> restanceMembers = new ArrayList<>();
    
    static {
        // ret sikker på jeg får fat i forkert readWrite metode. 
        restanceMembers = new ReadWrite().readObject();
        //restanceMembers = new 
    }
    
    public Restance(Member a, AllMembers b) {
        this.a = a;
        this.b = b;
    }
    
//    public arrayList restanceOversigt(b){
//        
//    }
    
//    public void delteMember(Member member) {
//        allMembers.add(member);
//        rw.write(allMembers);
//    }
//
//    public List<Member> showAllMembers() {
//        rw.write(allMembers);
//        return allMembers;
//    }
}
