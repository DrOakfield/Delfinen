package logic;


import java.util.ArrayList;

public class Member {
    private String Name;
    private int Age;
    private int ID;
    

    
    public Member(String Name, int Age/*, int ID*/) {
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
   
}
