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
public class MyCircle {

    private MyPoint center = new MyPoint();
    private int radius = 1;

    /**
     * Zirkulu berri bat sortzeko konstruktorea, ez du baliorik jasotzen,
     * zirkuluaren erdia (0,0) puntuan jartzen da eta zirkuluaren erradioari 1
     * balioa ematen zaio
     */
    public MyCircle() {
        this.center = new MyPoint();
        radius = 1;
    }

    /**
     * Zirkulu berri bat sortzeko konstruktorea, jasotako koordenatuetan
     * ezartzen da honen erdia eta jasotako erradioa ematen zaio
     */
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    /**
     * Zirkulu berri bat sortzeko konstruktorea, jasotako puntuan ezartzen da
     * honen erdia eta jasotako erradioa ematen zaio
     */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Metodoari deitzen dion eta jasotzen den zirkuluen arteko distantzia
     * kalkutzen du
     */
    public double distance(MyCircle another) {
        double distancia = center.distance(another.getCenter());
        return distancia;
    }

    /**
     * Jasotzen den puntua zirkuluaren barruan dagoen konprobatzen du
     */
    public boolean isInside(MyPoint puntua) {
        if (center.distance(puntua) < radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Zirkuluaren azalera bueltatzen du
     */
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    /**
     * Zirkuluaren koordenatuak bueltatzen ditu
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * Zirkuluaren X koordenatua bueltatzen du
     */
    public int getCenterX() {
        return center.getX();
    }

    /**
     * Zirkuluaren Y koordenatua bueltatzen du
     */
    public int getCenterY() {
        return center.getY();
    }

    /**
     * Zirkuluaren X eta Y koordenatuak bueltatzen ditu
     */
    public int[] getCenterXY() {
        return center.getXY();
    }

    /**
     * Zirkuluaren zirkunferentzia bueltzaten du
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Zirkuluaren erradio bueltatzen du
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Zirkuluaren posizioa ezartzeko balio du
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /**
     * Zirkuluaren X koordenatua ezartzeko balio du
     */
    public void setCenterX(int x) {
        center.setX(x);
    }

    /**
     * Zirkuluaren Y koordenatua ezartzeko balio du
     */
    public void setCenterY(int y) {
        center.setY(y);
    }

    /**
     * Zirklularen X eta Y koordenatuak ezartzeko balio du
     */
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    /**
     * Zirkuluaren erradioa ezartzeko balio du
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Zirkuluari buruzko informazioa bueltatzen du
     */
    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

}
