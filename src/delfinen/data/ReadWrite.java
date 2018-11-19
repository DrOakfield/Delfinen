
package delfinen.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import logic.Member;


public class ReadWrite {
    ObjectInputStream in;
    ObjectOutputStream out;
    private static final boolean DEBUG = true;
    private String MemberList = "./MemberList.txt";                                                    //"C:\\Users\\Bruger\\Documents\\NetBeansProjects\\Delfinen\\src\\data\\MemberList";

    public void write(List<Member> ListOfMembers) {
        
        try {
            File file = new File(MemberList);
            out = new ObjectOutputStream(new FileOutputStream(file));
//            out = new ObjectOutputStream(new FileOutputStream(MemberList));
            out.writeObject(ListOfMembers);
            out.flush();
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv skriv1 senere");
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv skriv2 senere");
            }
        }
    }

    public List<Member> readObject() {
         // skal denne ikke sættes under class og ikke undlades en værdi?
        try {
            File file = new File(MemberList);
            in = new ObjectInputStream(new FileInputStream(file));
            List<Member> p = (List<Member>) in.readObject();
            for (Member m : p) {
                System.out.println(m);
            }
            return p;
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv læs1 senere");
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv læs2 senere");
            }
        } catch (ClassNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv læs3 senere");
            }
        }
        return null;
    }
    
    
}
