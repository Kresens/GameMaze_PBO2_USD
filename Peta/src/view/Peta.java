/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;
import model.Pemain;
import model.Pixel;
import model.Tembok;

/**
 *
 * @author Priska
 */
public class Peta extends JPanel {

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
                        posisiY += jarak;
                        lebar = posisiX;
                        posisiX = 0;

                    } else if (item == '#') {
                        wall = new Tembok(posisiX, posisiY);
                        tembok.add(wall);
                        posisiX += jarak;

                    } else if (item == '@') {
                        maze = new Pemain(posisiX, posisiY);
                        posisiX += jarak;

                    } else if (item == '.') {
                        posisiX += jarak;
                    }
                    tinggi = posisiY;
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(Peta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, this.getLebar(), this.getTinggi());
        Peta.addAll(tembok);
        Peta.add(maze);
        for (int i = 0; i < Peta.size(); i++) {
            if (Peta.get(i) != null) {
                Pixel item = (Pixel) Peta.get(i);
                g.drawImage(item.getImage(), item.getPosisiX(), item.getPosisiY(), this);
            }
        }
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void PerintahGerak(String input) {
        String in[] = input.split(" ");
        if (in.length > 2) {
            JOptionPane.showMessageDialog(null, "Jumlah kata lebih dari 2");

        } else if (in.length == 2) {
            if (in[0].matches("[udrlz]")) {
                Allperintah.add(input);
                if (in[0].equalsIgnoreCase("u")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekNabrakTembok(maze, "u")) {
                            return;

                        } else if (cekBolaPemainTembok("u")) {
                            return;

                        } else {
                            maze.Gerak(0, -jarak);
                            repaint();
                        }
                    }
                } else if (in[0].equalsIgnoreCase("d")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekNabrakTembok(maze, "d")) {
                            return;
                        } else if (cekBolaPemainTembok("d")) {
                            return;
                        } else {
                            maze.Gerak(0, jarak);
                            repaint();
                        }
                    }
                } else if (in[0].equalsIgnoreCase("r")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekNabrakTembok(maze, "r")) {
                            return;
                        } else if (cekBolaPemainTembok("r")) {
                            return;
                        } else {
                            maze.Gerak(jarak, 0);
                            repaint();
                        }
                    }
                } else if (in[0].equalsIgnoreCase("l")) {
                    for (int i = 0; i < Integer.parseInt(String.valueOf(in[1])); i++) {
                        if (cekObjekNabrakTembok(maze, "l")) {
                            return;
                            
                        }
                    }
                }

            }
        }
    }

    private boolean cekObjekNabrakTembok(Pemain maze, String u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean cekBolaPemainTembok(String u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
