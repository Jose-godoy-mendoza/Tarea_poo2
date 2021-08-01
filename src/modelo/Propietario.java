/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Scanner;
/**
 *
 * @author joseg
 */
public class Propietario extends Persona{
    protected String nit;
    protected double cui;
   
    public Propietario(String nit, double cui, String nombres, String apellidos, String direccion, int telefono, int fecha_nacimiento, Tarjeta tarjeta) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento, tarjeta);
        this.nit = nit;
        this.cui = cui;
    }

    public Propietario() {}

    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getCui() {
        return cui;
    }

    public void setCui(double cui) {
        this.cui = cui;
    }
    
    @Override
    public void agregar()
    {
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("----- Datos del propietario -----");
        System.out.println("Nombres:   " + getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono:  "+ getTelefono());
        System.out.println("Edad:      "+ getFecha_nacimiento());
        System.out.println("Nit:       "+getNit());
        System.out.println("CUI:       "+getCui());
        System.out.println("no tarjeta: "+tarjeta.getNo_tarjeta());
        System.out.println("uso:       "+tarjeta.getUso());
        System.out.println("______________________________");
    }
    
    @Override
    public void mostrar()
    {
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("----- Datos del propietario -----");
        System.out.println("Nombres:   " + getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono:  "+ getTelefono());
        System.out.println("Edad:      "+ getFecha_nacimiento());
        System.out.println("Nit:       "+getNit());
        System.out.println("CUI:       "+getCui());
        System.out.println("no tarjeta: "+tarjeta.getNo_tarjeta());
        System.out.println("uso:       "+tarjeta.getUso());
        System.out.println("______________________________");
    }
}
