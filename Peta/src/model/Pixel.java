/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author Priska
 */
public class Pixel {
    private int posisiX;
    private int posisiY;
    private Image image;
    private int Jarak = 20;
    
     public Pixel(int x, int y) {
        this.posisiX = x;
        this.posisiY = y;
    }
     
     public int getPosisiX() {
        return posisiX;
    }
}
