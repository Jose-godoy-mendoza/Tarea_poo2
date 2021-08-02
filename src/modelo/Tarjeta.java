/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joseg
 */
public class Tarjeta {
    protected String no_tarjeta, uso;

    public Tarjeta(){}
    
    public Tarjeta(String no_tarjeta, String uso) {
        this.no_tarjeta = no_tarjeta;
        this.uso = uso;
    }
    
    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    public void agregar()
    {
        System.out.println(no_tarjeta);
        System.out.println(uso);
    }
    public void mostrar()
    {
        System.out.println(no_tarjeta);
        System.out.println(uso);
    }
}
