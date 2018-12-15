/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.URL;

/**
 *
 * @author Priska
 */
public class Pemain extends Pixel{
    public Pemain(int x, int y) {
        super(x, y);
        URL loc = this.getClass().getResource("pemain.jpg");
    }
    
}
