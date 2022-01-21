/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author soto.aitzol
 */
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Laukizuzen berri bat sortzeko konstruktorea
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Laukizuzenaren azalera bueltatzen du
     */
    public double getAzalera() {
        int zabalera = bottomRight.getX() - topLeft.getX();
        int altuera = topLeft.getY() - bottomRight.getY();

        return zabalera * altuera;
    }

    /**
     * Laukizuzenaren perimetroa bueltatzen du
     */
    public double getPerimetroa() {
        int zabalera = bottomRight.getX() - topLeft.getX();
        int altuera = topLeft.getY() - bottomRight.getY();

        return 2 * (zabalera + altuera);

    }

    /**
     * Laukizuzenaren goiko ezker-aldeko puntua bueltatzen du
     */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /**
     * Laukizuzenaren beheko eskubi-aldeko puntua bueltatzen du
     */
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /**
     * Laukizuzenaren goiko ezker-aldeko puntua ezartzeko balio du
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Laukizuzenaren beheko eskubi-aldeko puntua ezartzeko balio du
     */
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * Laukizuzenari buruzko informazioa bueltatzen du
     */
    @Override
    public String toString() {
        return "MyRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

}
