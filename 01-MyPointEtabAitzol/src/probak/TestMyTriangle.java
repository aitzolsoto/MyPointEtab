/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyPoint;
import model.MyTriangle;

/**
 *
 * @author soto.aitzol
 */
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle tri1 = new MyTriangle(0,16,-3,12,3,12);
        System.out.println(tri1);
        System.out.println("  Perimetroa: " + tri1.getPerimeter());
        System.out.println("  Mota: " + tri1.getType());
        System.out.println("");
        
        MyTriangle tri2 = new MyTriangle(new MyPoint(0,1),new MyPoint(4,1),new MyPoint(0,4));
        System.out.println(tri2);    
        System.out.println("  Perimetroa: " + tri2.getPerimeter());
        System.out.println("  Mota: " + tri2.getType());
        System.out.println("");
    }
}
