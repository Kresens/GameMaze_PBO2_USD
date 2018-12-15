/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Pemain;

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
}
