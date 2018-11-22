package logic;

import delfinen.data.ReadWrite;
import java.util.ArrayList;
import java.util.List;

public class AllMembers {
    ReadWrite rw = new ReadWrite();

    private static List<Member> allMembers = new ArrayList<>();
    private static List<Member> MedlemsRestance = new ArrayList<>();
    
    /**
     * Copies objects from file into an arraylist
     */
    static {
        allMembers = new ReadWrite().readObject();
//        MedlemsRestance = new ReadWrite().readObjectMRestance();
    }
    
    /**
     * 
     * @param name
     * @param age
     * @param Id
     * @param aktiv - aktiv/passiv boolean
     * @param aktivTekst - aktiv/passiv tekst
     * @param jES - Junior eller senior
     * @param konSvøm - KonkurrenceSvømmer
     * @return 
     */
    public Member createMember(String name, int age, int Id, boolean aktiv, String aktivTekst, String jES, String konSvøm) {
        return new Member(name, age, Id, aktiv, aktivTekst, jES, konSvøm);
    }
    /**
     * Adds member to arraylist (allMembers)
     * @param member - Writes member into the text file
     */
    public void addMember(Member member) {
        //add til medlemsoversigt
        allMembers.add(member);
        rw.write(allMembers);
        //add til restanceOversigt
//        MedlemsRestance.add(member);
//        rw.writeMRestance(MedlemsRestance);
    }
    /**
     * writes all members into text file
     * @return arraylist of all members
     */
    public List<Member> showAllMembers() {
        rw.write(allMembers);
        return allMembers;
    }
    
    public List<Member> showRestanceOversigt(){
        rw.writeMRestance(MedlemsRestance);
        return MedlemsRestance;
    }
    /**
     * reads member id's from text file
     * @return 
     */
    public int readID(){
        return rw.readWithBufferedReader();
    }
    /**
     * Writes member id's to text file
     * @param ID - member ID
     */
    public void writeID(int ID){
        rw.writeWithBufferedWriter(ID);
    }
    
}
