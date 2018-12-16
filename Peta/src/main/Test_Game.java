/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import model.Sel;
import model.Tempat;
import view.GameFrame;
import view.TempatPanel;

/**
 *
 * @author Priska
 */
public class Test_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sel sel = new Sel(1,1 ,20,20, '@', Color.PINK);
        Sel sel1 = new Sel (3,1 ,20,20, '@', Color.BLUE);
        
        Tempat tempat = new Tempat();
        tempat.tambahSel(sel);
        tempat.tambahSel(sel1);
        Tempat.batasKanan=500;
        Tempat.batasBawah=300;     
        TempatPanel tempatPanel = new TempatPanel();
        tempatPanel.setTempat(tempat);
        GameFrame game = new GameFrame("My Game",tempatPanel);
    }
    
}
