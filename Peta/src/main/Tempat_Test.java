/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFileChooser;
import model.Tempat;

/**
 *
 * @author Priska
 */
public class Tempat_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser jf = new JFileChooser();
        int returnVal = jf.showOpenDialog(null);
        Tempat tempat = new Tempat();
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            tempat.bacaKonfigurasi(jf.getSelectedFile());
            System.out.println("Isi peta = ");
            System.out.println(tempat.getIsi());
            if (tempat.getDaftarSel() != null) {
                for (int i = 0; i < tempat.getDaftarSel().size(); i++) {
                    System.out.println(
                            tempat.getDaftarSel().get(i).getBaris() + ","
                            + tempat.getDaftarSel().get(i).getKolom() + ","
                            + tempat.getDaftarSel().get(i).getNilai());

                }
            }
        }
    }
}
