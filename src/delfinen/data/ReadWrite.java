
package delfinen.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import logic.Member;


public class ReadWrite {
    ObjectInputStream in;
    ObjectOutputStream out;
    private static final boolean DEBUG = true;
    private String MemberList = "./MemberList.txt";
    private String MedlemsRestance = "./MedlemsRestance.txt";
    private String IDListe = "./ID.txt";
    
    /**
     * Writes list of members to file
     * @param ListOfMembers 
     */
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

    /**
     * Reads list of objects from memberList
     * @return 
     */
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
    
    /**
     * Writes List of members in restance
     * @param ListOfMembers 
     */
    public void writeMRestance(List<Member> ListOfMembers) {
        
        try {
            File file = new File(MedlemsRestance);
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
    
    /**
     * Reads Objects from list of members in restance
     * @return 
     */
    public List<Member> readObjectMRestance() {
        // skal denne ikke sættes under class og ikke undlades en værdi?
        try {
            File file = new File(MedlemsRestance);
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
    
    /**
     * Writes id's of members in a file
     * @param ID 
     */
    public void writeWithBufferedWriter(int ID) {
        BufferedWriter out = null;
        try {
            File file = new File(IDListe);
            out = new BufferedWriter(new FileWriter(file));
            out.write(Integer.toString(ID));
            out.flush();
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if (DEBUG) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    /**
     * Reads list of member id's
     * @return 
     */
    public int readWithBufferedReader() {
        String str;
        try {
            File file = new File(IDListe);
            FileReader fr = new FileReader(file);
            BufferedReader in = new BufferedReader(fr);
            str = in.readLine();
            return Integer.parseInt(str);
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        }
        return 0;
    }
}
