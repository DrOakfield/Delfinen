package logic;


import java.io.Serializable;
import java.util.ArrayList;

public class Member implements Serializable {
    private String Name;
    private int Age;
    private int Id;

    public Member(String Name, int Age, int Id) {
        this.Name = Name;
        this.Age = Age;
        this.Id = Id;
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


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
 
    
    @Override
    public String toString() {
        return "Member: " + Name + "," + Age + ", " + Id + "\n";
    }
   
}
