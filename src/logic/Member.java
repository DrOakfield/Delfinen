package logic;


import java.io.Serializable;
import java.util.ArrayList;

public class Member implements Serializable {
    private String Name;
    private int Age;
    private int Id;
    private String aktiv;
    private String jES;
    private String konSvøm;

    public Member(String Name, int Age, int Id, String aktiv, String jES, String konSvøm) {
        this.Name = Name;
        this.Age = Age;
        this.Id = Id;
        this.aktiv = aktiv;
        this.jES = jES;
        this.konSvøm = konSvøm;
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

    public String getAktiv() {
        return aktiv;
    }

    public void setAktiv(String aktiv) {
        this.aktiv = aktiv;
    }

    public String getjES() {
        return jES;
    }

    public void setjES(String jES) {
        this.jES = jES;
    }

    public String getKonSvøm() {
        return konSvøm;
    }

    public void setKonSvøm(String konSvøm) {
        this.konSvøm = konSvøm;
    }
 
    @Override
    public String toString() {
        return "Member: " + Name + "," + Age + ", " + Id + "\n";
    }
   
}
