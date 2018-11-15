package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Members {
    private String Name;
    private int Age;
    //private int ID;
    private ArrayList<Members> allMembers = new ArrayList<>();
    private static final boolean DEBUG = true;
    private String MemberList = "C:\\Users\\Bruger\\Documents\\NetBeansProjects\\Delfinen\\src\\delfinen.data\\MemberList";
                                
    public Members(String Name, int Age/*, int ID*/) {
        this.Name = Name;
        this.Age = Age;
      //  this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

/*
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
  */  
    
    @Override
    public String toString() {
        return "Members{" + "Name=" + Name + ", Age=" + Age + /*", ID=" + ID*/ + '}';
    }
    
    public void addMember(String Name, int Age /*,int ID*/  ){
        Members member = new Members(Name, Age /*, ID*/);
        allMembers.add(member);
        
    }
    public ArrayList showAllMembers(){
        return allMembers;
    }
    
    public void write(List<List> ListOfMembers) {
        ObjectOutputStream out = null;
        try {
            File file = new File(MemberList);
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(ListOfMembers);
            out.flush();
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();{
            System.out.println("prøv igen senere");
        }
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();{
            System.out.println("prøv igen senere");
        }
        }
    }
    
    public List<List> readObject(){
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
            if(DEBUG) ex.printStackTrace();{
            System.out.println("prøv igen senere");
        }
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();{
            System.out.println("prøv igen senere");
        }
        } catch (ClassNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();{
            System.out.println("prøv igen senere");
        }
        }
        return null;
    }
}
