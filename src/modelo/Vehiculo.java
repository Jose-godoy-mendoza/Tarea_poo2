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
public class Vehiculo {
    protected String placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos;
    protected Tarjeta tarjeta;
    protected Tipo tipo;
    
    public Vehiculo(){}

    public Vehiculo(String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, Tarjeta tarjeta, Tipo tipo) {
        this.placa = placa;
        this.chasis = chasis;
        this.serie = serie;
        this.motor = motor;
        this.cilindros = cilindros;
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.asientos = asientos;
        this.tarjeta = tarjeta;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
 

    public void agregar()
    {
        System.out.println("______________________________");
        System.out.println("----- Datos del Vehiculo -----");
        System.out.println("Placa:   "+getPlaca());
        System.out.println("Chasis:  "+getChasis());
        System.out.println("Serie :  "+getSerie());
        System.out.println("Motor:   "+getMotor());
        System.out.println("Cilindros: "+getCilindros());
        System.out.println("Marca:   "+getMarca());
        System.out.println("Modelo:  "+getModelo());
        System.out.println("Linea:   "+getLinea());
        System.out.println("Asientos: "+getAsientos());
        
        System.out.println("Tipo:     "+tipo.getTipo());
         
        System.out.println("No de tarjeta: "+tarjeta.getNo_tarjeta());
        System.out.println("Uso:      "+tarjeta.getUso());
        System.out.println("______________________________");
    }
    public void mostrar()
    {
        System.out.println("______________________________");
        System.out.println("----- Datos del Vehiculo -----");
        System.out.println("Placa:   "+getPlaca());
        System.out.println("Chasis:  "+getChasis());
        System.out.println("Serie :  "+getSerie());
        System.out.println("Motor:   "+getMotor());
        System.out.println("Cilindros: "+getCilindros());
        System.out.println("Marca:   "+getMarca());
        System.out.println("Modelo:  "+getModelo());
        System.out.println("Linea:   "+getLinea());
        System.out.println("Asientos: "+getAsientos());
        
        System.out.println("Tipo:     "+tipo.getTipo());
         
        System.out.println("No de tarjeta: "+tarjeta.getNo_tarjeta());
        System.out.println("Uso:      "+tarjeta.getUso());
        System.out.println("______________________________");
    }
}
