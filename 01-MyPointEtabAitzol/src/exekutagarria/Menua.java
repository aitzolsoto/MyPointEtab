/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.MyCircle;
import model.MyPoint;
import model.MyRectangle;
import model.MyTriangle;

/**
 *
 * @author soto.aitzol
 */
public class Menua {

    private int aukera;
    private Scanner in = new Scanner(System.in);

    /**
     * Menua sortzeko konstruktorea
     */
    public Menua() {
        do {
            try {
                System.out.println("MENUA");
                System.out.println("------------");
                System.out.println("1-Puntu baten jatorriarekiko distantzia kalkulatu");
                System.out.println("2-Bi punturen arteko distantzia kalkulatu");
                System.out.println("3-Bi zirkuluren arteko distantzia kalkulatu");
                System.out.println("4-Puntu bat zirkulu baten barruan dagoen konprobatu");
                System.out.println("5-Zirkulu baten azalera kalkulatu");
                System.out.println("6-Zirkulu baten zirkunferentzia kalkulatu");
                System.out.println("7-Laukizuzen baten azalera ikusi");
                System.out.println("8-Laukizuzen baten perimetroa ikusi");
                System.out.println("9-Triangelu baten perimetroa kalkulatu");
                System.out.println("10-Triangelu mota ikusi");
                System.out.println("11-Irten");

                System.out.println("");
                System.out.print("Sartu zenbaki bat: ");
                aukera = in.nextInt();

                switch (aukera) {
                    case 1:
                        System.out.println("Jatorriarekiko distantzia: " + puntuBerriaSortu().distance());
                        break;
                    case 2:
                        System.out.println("Bi puntuen arteko distantzia: " + puntuBerriaSortu().distance(puntuBerriaSortu()));
                        break;
                    case 3:
                        System.out.println("Bi zirkuluen arteko distantzia: " + zirkuluBerriaSortu().distance(zirkuluBerriaSortu()));
                        break;
                    case 4:
                        System.out.println("Puntua zirkuluaren barruan dago? " + zirkuluBerriaSortu().isInside(puntuBerriaSortu()));
                        break;
                    case 5:
                        System.out.println("Zirkuluaren azalera: " + zirkuluBerriaSortu().getArea());
                        break;
                    case 6:
                        System.out.println("Zirkuluaren zirkunferentzia: " + zirkuluBerriaSortu().getCircumference());
                        break;
                    case 7:
                        System.out.println("Laukizuzenaren azalera: " + laukizuzenBerriaSortu().getAzalera());
                        break;
                    case 8:
                        System.out.println("Laukizuzenaren perimetroa: " + laukizuzenBerriaSortu().getPerimetroa());
                        break;
                    case 9:
                        System.out.println("Triangeluaren perimetroa: " + triangeluBerriaSortu().getPerimeter());
                        break;
                    case 10:
                        System.out.println("Triangelu mota: " + triangeluBerriaSortu().getType());
                        break;
                    default:
                        System.out.println("Zenbaki horrek ez du balio, sartu beste zenbaki bat");
                        break;
                }
            } catch (InputMismatchException ex) {
                in.next();
            } catch (Exception ex) {
                in.next();
            }
        } while (aukera != 11);

    }

    /**
     * Puntu berri bat sortzeko metodoa, erabiltzaileak sartu behar ditu
     * puntuaren X eta Y koordenatuak
     */
    public MyPoint puntuBerriaSortu() {
        System.out.print("Sartu puntu berriaren koordenatuak(X Y): ");
        return new MyPoint(in.nextInt(), in.nextInt());
    }

    /**
     * Zirkulu berri bat sortzeko metodoa, erabiltzaileak sartu behar ditu
     * zirkuluaren X eta Y koordenatuak eta zirkuluaren erradioa
     */
    public MyCircle zirkuluBerriaSortu() {
        System.out.print("Sartu zirkuluaren informazioa(X Y erradioa): ");
        int x = in.nextInt();
        int y = in.nextInt();
        int erradioa = in.nextInt();
        return new MyCircle(new MyPoint(x, y), erradioa);
    }

    /**
     * Laukizuzen berri bat sortzeko metodoa, erabiltzaileak sartu behar ditu
     * laukizuzenaren bi erpinen koordenatuak
     */
    public MyRectangle laukizuzenBerriaSortu() {
        System.out.print("Sartu goiko ezkerreko erpinaren koordenatuak(X Y): ");
        int topLeftX = in.nextInt();
        int topLeftY = in.nextInt();
        System.out.print("Sartu beheko eskubiko erpinaren koordenatuak(X Y): ");
        int bottomRightX = in.nextInt();
        int bottomRightY = in.nextInt();

        return new MyRectangle(new MyPoint(topLeftX, topLeftY), new MyPoint(bottomRightX, bottomRightY));
    }

    /**
     * Triangelu berri bat sortzeko metodoa, erabiltzaileak sartu behar ditu
     * erpin bakoitzaren koordenatuak
     */
    public MyTriangle triangeluBerriaSortu() {
        System.out.print("Sarttu lehenengo erpinaren koordenatuak(X Y): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Sarttu bigarren erpinaren koordenatuak(X Y): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.print("Sarttu hirugarren erpinaren koordenatuak(X Y): ");
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        return new MyTriangle(x1, y1, x2, y2, x3, y3);
    }

    /**
     * Programa ejekutatzen duen main metodoa
     */
    public static void main(String[] args) {
        new Menua();
    }
}
