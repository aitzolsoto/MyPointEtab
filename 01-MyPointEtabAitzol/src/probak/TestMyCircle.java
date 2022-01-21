/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyCircle;
import model.MyPoint;

/**
 *
 * @author soto.aitzol
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle zirkulu1 = new MyCircle();
        System.out.println("zirkulu1 => " + zirkulu1);
        
        MyCircle zirkulu2 = new MyCircle(4,2,15);
        System.out.println("zirkulu2 => " + zirkulu2);

        MyCircle zirkulu3 = new MyCircle(new MyPoint(3,2),5);
        System.out.println("zirkulu3 => " + zirkulu3);
        
        //
        System.out.println("DISTANTZIAK");
        System.out.println("=======================");
        System.out.println("Nondik - Nora  =>");
        System.out.println("-----------------------");
        System.out.println("zirkulu1 - zirkulu2 => " + zirkulu1.distance(zirkulu2));
        System.out.println("zirkulu1 - zirkulu3 => " + zirkulu1.distance(zirkulu3));
        System.out.println("zirkulu2 - zirkulu3 => " + zirkulu2.distance(zirkulu3));
        
          
        MyPoint p0 = new MyPoint();
        if (zirkulu3.isInside(new MyPoint(0,0))){
            System.out.println("Hirugarren zirkuluak koordenatuen jatorria barne hartzen du");
        }
    }
}
