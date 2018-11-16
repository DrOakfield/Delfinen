package logic;

import java.util.ArrayList;

public class AllMembers {
    private ArrayList<Member> allMembers = new ArrayList<>();
    
    
    public void addMember(String Name, int Age /*,int ID*/){
        Member member = new Member(Name, Age /*, ID*/);
        allMembers.add(member);
        
    }
    public ArrayList showAllMembers(){
        return allMembers;
    }
    
}
