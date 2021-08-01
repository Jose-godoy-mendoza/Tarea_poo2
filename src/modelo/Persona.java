/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author joseg
 */
public class Persona {
    protected String nombres, apellidos, direccion;
    protected int telefono;
    protected int fecha_nacimiento;
    protected Tarjeta tarjeta;

    public Persona(){}
    
    public Persona(String nombres, String apellidos, String direccion, int telefono, int fecha_nacimiento, Tarjeta tarjeta) { 
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tarjeta = tarjeta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public void agregar(){}
    public void mostrar(){}
    
    public int edad(int fecha_nacimiento, int mes, int dia)
    {
        
        Period edad = Period.between(LocalDate.of(fecha_nacimiento, mes, dia), LocalDate.now());
        System.out.println(String.format("%d años, %d meses y %d días",
        edad.getYears(),
        edad.getMonths(),
        edad.getDays()));
        return edad.getYears();
    }
}
