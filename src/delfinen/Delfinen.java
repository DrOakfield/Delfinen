/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen;

import delfinen.presentation.MainMenu;
import java.util.ArrayList;
import logic.Members;

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
        Members m1 = new Members("Mogens", 22);
        m1.addMember("Birger", 65);
        MainMenu mm = new MainMenu(m1);
        mm.setVisible(true);
        //kald Arraylist + lav hele sætop til p,c,l,d
    }

}
