package logic;

import delfinen.data.ReadWrite;
import java.util.ArrayList;
import java.util.List;

public class AllMembers {

    private static List<Member> allMembers = new ArrayList<>();

    static {
        allMembers = new ReadWrite().readObject();
    }

    public Member createMember(String name, int age, int Id) {
        return new Member(name, age, Id);
    }

    public void addMember(Member member) {
        allMembers.add(member);
        ReadWrite rw = new ReadWrite();
        rw.write(allMembers);
    }

    public List<Member> showAllMembers() {

        return allMembers;
    }
    
}
