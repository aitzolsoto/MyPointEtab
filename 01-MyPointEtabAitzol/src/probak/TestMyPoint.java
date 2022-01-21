/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyPoint;
import java.util.ArrayList;

/**
 *
 * @author aitzol
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4,0);
        
        
        //Distantzia jatorriarekiko
        System.out.println("Distantzia jatorriarekiko");
        System.out.println("--------------------------");
        System.out.println(p0.distance());
        System.out.println(p1.distance());
        System.out.println(p2.distance());
        
        //Distantzia puntuen artean another point
        System.out.println("Distantzia euren artean");
        System.out.println("--------------------------");
        System.out.println(p0.distance(p1));
        System.out.println(p0.distance(p2));
        System.out.println(p1.distance(p2));
        
        //Distantzia puntuen artean intx int y
        System.out.println("Distantzia euren artean");
        System.out.println("--------------------------");
        System.out.println(p0.distance(2,1));
        System.out.println(p0.distance(4,0));
        System.out.println(p1.distance(4,0));
        
        //Puntuen Arraya
        MyPoint[] puntuenArraya = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            puntuenArraya[i] = new MyPoint(i+1, i+1);
            //System.out.println(puntuenArraya[i].toString());
        }
        
        //ArrayList
        ArrayList<MyPoint> puntuenLista = new ArrayList<MyPoint>();
        for (int i = 0; i < 100; i++) {
            puntuenLista.add(new MyPoint(i, i));
        }
        //System.out.println(puntuenLista.toString());
        
        //Ausazko puntuak
        MyPoint[] ausazkoPuntuak = new MyPoint[5];
        for (int i = 0; i < 5; i++) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);
            ausazkoPuntuak[i] = new MyPoint(x,y);
            System.out.println(ausazkoPuntuak[i].toString());
        }
    }
}
