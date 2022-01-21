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
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    /**
     * Triangelu berri bat sortzeko konstruktorea, erpin bakoitzaren
     * koordenatuak jaso eta ezartzen ditu
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    /**
     * Trinagelu berri bat sortzeko konstruktorea, erpin bakoitzaren puntua jaso
     * eta ezartzen du
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * Triangeluaren perimetroa bueltatzen du
     */
    public double getPerimeter() {
        double luzeraV1 = v1.distance(v2);
        double luzeraV2 = v2.distance(v3);
        double luzeraV3 = v3.distance(v1);

        return luzeraV1 + luzeraV2 + luzeraV3;
    }

    /**
     * Triangelu mota bueltatzen du
     */
    public String getType() {
        double luzeraV1 = v1.distance(v2);
        double luzeraV2 = v2.distance(v3);
        double luzeraV3 = v3.distance(v1);
        if (luzeraV1 == luzeraV2 && luzeraV1 == luzeraV3) {
            return "Aldekidea";
        } else if ((luzeraV1 == luzeraV2 && luzeraV1 != luzeraV3) || (luzeraV1 == luzeraV3 && luzeraV1 != luzeraV2) || (luzeraV2 == luzeraV3 && luzeraV2 != luzeraV1)) {
            return "Isoszelea";
        } else {
            return "Eskalenoa";
        }
    }

    /**
     * Triangeluaren lehenengo erpinaren posizioa ezartzen du
     */
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    /**
     * Triangeluaren bigarren erpinaren posizioa ezartzen du
     */
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    /**
     * Triangeluaren hirugarren erpinaren posizioa ezartzen du
     */
    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    /**
     * Triangeluaren lehenengo erpinaren posizioa bueltatzen du
     */
    public MyPoint getV1() {
        return v1;
    }

    /**
     * Triangeluaren bigarren erpinaren posizioa bueltatzen du
     */
    public MyPoint getV2() {
        return v2;
    }

    /**
     * Triangeluaren hirugarren erpinaren posizioa bueltatzen du
     */
    public MyPoint getV3() {
        return v3;
    }

    /**
     * Triangeluari buruzko informazioa bueltatzen du
     */
    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

}
