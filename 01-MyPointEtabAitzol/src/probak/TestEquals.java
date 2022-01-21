/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyPoint;

/**
 *
 * @author soto.aitzol
 */
public class TestEquals {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(7,8);
        MyPoint p2 = new MyPoint(7,8);

        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        }
    }
}
