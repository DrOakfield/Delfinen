package logic;


import java.util.ArrayList;

public class Members {
    private String Name;
    private int Age;
    private int ID;
    private ArrayList<Members> allMembers = new ArrayList<>();

    
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


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
 
    
    @Override
    public String toString() {
        return "Members{" + "Name=" + Name + ", Age=" + Age + /*", ID=" + ID*/ + '}';
    }
    
    public void addMember(String Name, int Age /*,int ID*/){
        Members member = new Members(Name, Age /*, ID*/);
        allMembers.add(member);
        
    }
    public ArrayList showAllMembers(){
        return allMembers;
    }
    
}
