/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoneurona;

/**
 *
 * @author levi
 */
public class Entradas {

    public int y1;
    public int y2;
    public int y3;
    public int yd;
    public String estado;

    public Entradas() {
    }

    public Entradas(int y1, int y2, int y3, int yd) {
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.yd = yd;
   
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getYd() {
        return yd;
    }

    public void setYd(int yd) {
        this.yd = yd;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
    
}
