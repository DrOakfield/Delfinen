/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen;

import delfinen.presentation.MainMenu;
import java.util.ArrayList;
import logic.AllMembers;
import logic.Member;

/**
 *
 * @author Mads Egevang Jensen
 */
public class Delfinen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Member m1 = new Member("Mogens", 22, 2, "ja", "Senior", "Ja");
        AllMembers am = new AllMembers();
        MainMenu mm = new MainMenu(m1, am);
        mm.setVisible(true);
        //kald Arraylist + lav hele sætop til p,c,l,d
    }

}
