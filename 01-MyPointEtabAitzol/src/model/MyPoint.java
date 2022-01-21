/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aitzol
 */
public class MyPoint {

    private int x;
    private int y;

    /**
     * Puntu berri bat sortzeko konstruktorea
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Puntu berri bat sortzeko konstruktorea, ez du baliorik jasotzen, 0 balioa
     * ezartzen zaie X eta Y-ri
     */
    public MyPoint() {
        x = 0;
        y = 0;
    }

    /**
     * Jatorriarekiko (0,0) dagoen distantzia bueltatzen du
     */
    public double distance() {
        if (x == 0) {
            return (double) y;
        } else if (y == 0) {
            return (double) x;
        } else {

            return Math.sqrt((x * x) + (y * y));
        }
    }

    /**
     * Metodoari deitzen dion eta jasotzen den puntuen arteko distantzia
     * kalkulatzen du
     */
    public double distance(MyPoint another) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        if (x == another.getX() && y > another.getY()) {
            return y - another.getY();
        } else if (x == another.getX() && y < another.getY()) {
            return another.getY() - y;
        } else if (y == another.getY() && x > another.getX()) {
            return x - another.getX();
        } else if (y == another.getY() && x < another.getX()) {
            return another.getX() - x;
        } else if (x > another.getX()) {
            x2 = x;
            y2 = y;
            x1 = another.getX();
            y1 = another.getY();
        } else if (x < another.getX()) {
            x2 = another.getX();
            y2 = another.getY();
            x1 = x;
            y1 = y;
        }

        int azkenX = x2 - x1;
        int azkenY = y2 - y1;
        return Math.sqrt((azkenX * azkenX) + (azkenY * azkenY));
    }

    /**
     * Metodoari deitzen dion eta jasotzen dituen koordenatuen arteko distantzia
     * kalkulatzen du
     */
    public double distance(int x, int y) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        if (this.x == x && this.y > y) {
            return this.y - y;
        } else if (this.x == x && this.y < y) {
            return y - this.y;
        } else if (this.y == y && this.x > x) {
            return this.x - x;
        } else if (this.y == y && this.x < x) {
            return x - this.x;
        } else if (this.x > x) {
            x2 = this.x;
            y2 = this.y;
            x1 = x;
            y1 = y;
        } else if (this.x < x) {
            x2 = x;
            y2 = y;
            x1 = this.x;
            y1 = this.y;
        }

        int azkenX = x2 - x1;
        int azkenY = y2 - y1;
        return Math.sqrt((azkenX * azkenX) + (azkenY * azkenY));
    }
    
   

    /**
     * Puntu baten X balioa bueltatzen du
     */
    public int getX() {
        return x;
    }

    /**
     * Puntu baten Y balioa bueltatzen du
     */
    public int getY() {
        return y;
    }

    /**
     * Puntu baten X balioa ezartzeko balio du
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Puntu baten Y balioa ezartzeko balio du
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Puntu baten X eta Y balioak bueltatzen ditu
     */
    public int[] getXY() {
        int[] array = {x, y};
        return array;
    }

    /**
     * Puntu baten X eta Y balioak ezartzeko balio du
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Puntuari buruzko informazioa bueltatzen du
     */
    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     * Bi puntu posizio berdinean dauden konprobatzen du
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyPoint other = (MyPoint) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

}
