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
    public void operation(String tipo)
    {
        if ((tipo.equals("Carro"))||(tipo.equals("Motocicleta")))
        {
            System.out.println("Este vehiculo es terrestre \n y tiene velocidades de 1 a 5");
        }
        else if((tipo.equals("Bus"))||(tipo.equals("Camioneta")) || (tipo.equals("Taxi")))
        {
            System.out.println("Este vehiculo es terrestre y es para llevar a varias personas");
        }
        else if((tipo.equals("Tractor"))||(tipo.equals("Pick-up")))
        {
            System.out.println("Este vehiculo es terrestre y de carga pesada");
        }
         else if(tipo.equals("Avion"))
        {
            System.out.println("Este vehiculo es aereo y se usa para llevar a varias personas");
        }
         else if(tipo.equals("Helicoptero"))
        {
            System.out.println("Este vehiculo es aereo y no puede llevar mucho peso");
        }
         else if(tipo.equals("Barco"))
        {
            System.out.println("Este vehiculo es marino y tiene varios propositos");
        }
    }
}
