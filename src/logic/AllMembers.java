package logic;

import delfinen.data.ReadWrite;
import java.util.ArrayList;
import java.util.List;

public class AllMembers {
    ReadWrite rw = new ReadWrite();

    private static List<Member> allMembers = new ArrayList<>();
    private static List<Member> MedlemsRestance = new ArrayList<>();

//    static {
//        allMembers = new ReadWrite().readObject();
//        MedlemsRestance = new ReadWrite().readObject();
//    }

    public Member createMember(String name, int age, int Id, boolean aktiv, String aktivTekst, String jES, String konSvøm) {
        return new Member(name, age, Id, aktiv, aktivTekst, jES, konSvøm);
    }
    
    public void addMember(Member member) {
        //add til medlemsoversigt
        allMembers.add(member);
        rw.write(allMembers);
        //add til restanceOversigt
//        MedlemsRestance.add(member);
//        rw.write(MedlemsRestance);
    }

    public List<Member> showAllMembers() {
        rw.write(allMembers);
        return allMembers;
    }
    // ".*\\d+.*"
    
    public List<Member> showRestanceOversigt(){
        rw.write(MedlemsRestance);
        return MedlemsRestance;
    }
    
}
