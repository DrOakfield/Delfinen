
package delfinen.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class ReadWrite {
        private static final boolean DEBUG = true;
        private String MemberList = "C:\\Users\\Bruger\\Documents\\NetBeansProjects\\Delfinen\\src\\delfinen.data\\MemberList";

    public void write(List<List> ListOfMembers) {
        ObjectOutputStream out = null;
        try {
            File file = new File(MemberList);
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(ListOfMembers);
            out.flush();
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv igen senere");
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv igen senere");
            }
        }
    }

    public List<List> readObject() {
        ObjectInputStream in = null;
        try {
            File file = new File(MemberList);
            in = new ObjectInputStream(new FileInputStream(file));
            List<List> p = (List<List>) in.readObject();
            for (List list : p) {
                System.out.println(list);
            }
            return p;
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv igen senere");
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv igen senere");
            }
        } catch (ClassNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
            {
                System.out.println("prøv igen senere");
            }
        }
        return null;
    }
}
