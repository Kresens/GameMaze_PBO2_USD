/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Pemain;
import model.Tembok;

/**
 *
 * @author Priska
 */
public class Peta extends JPanel{
    private ArrayList tembok = new ArrayList();
    private ArrayList bola = new ArrayList();
    private ArrayList Peta = new ArrayList();
    
    private Pemain maze;
    private int lebar = 0;
    private int tinggi = 0;
    private int jarak = 20;
    
    private File Alamatpeta;
    private ArrayList Allperintah = new ArrayList();
    
    public Peta(File file) {
        setPeta(file);
    }
    
     public void setPeta(File file) {
          try {
               if (file != null) {
                   FileInputStream input = new FileInputStream(file);
                   Alamatpeta = file;
                   int posisiX = 0;
                   int posisiY = 0;
                   Tembok wall;
                   int data;
                
                while ((data = input.read()) != -1) {
                    char item = (char) data;
                    if (item == '\n') {
                        
                    }
                }
                   
               }
     }
        }
}
