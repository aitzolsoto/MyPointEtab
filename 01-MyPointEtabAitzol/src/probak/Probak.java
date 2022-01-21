/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyCircle;

/**
 *
 * @author soto.aitzol
 */
public class Probak {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(0, 0, 100);
        MyCircle c2 = new MyCircle(150, -150, 50);
        
        System.out.println(c1.distance(c2));
        
    }
}
