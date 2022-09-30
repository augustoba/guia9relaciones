
package ejercicio3extra.entity;

import ejercicio3extra.Enum.*;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private Integer anio;
    private Long numerodeMotor;
    private Long numerodeChasis;
    private String color;
    private TIPODEVEHICULO tipodeVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, Long numerodeMotor, Long numerodeChasis, String color, TIPODEVEHICULO tipodeVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numerodeMotor = numerodeMotor;
        this.numerodeChasis = numerodeChasis;
        this.color = color;
        this.tipodeVehiculo = tipodeVehiculo;
    }

    public TIPODEVEHICULO getTipodeVehiculo() {
        return tipodeVehiculo;
    }

    public void setTipodeVehiculo(TIPODEVEHICULO tipodeVehiculo) {
        this.tipodeVehiculo = tipodeVehiculo;
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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Long getNumerodeMotor() {
        return numerodeMotor;
    }

    public void setNumerodeMotor(Long numerodeMotor) {
        this.numerodeMotor = numerodeMotor;
    }

    public Long getNumerodeChasis() {
        return numerodeChasis;
    }

    public void setNumerodeChasis(Long numerodeChasis) {
        this.numerodeChasis = numerodeChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "VEHICULO: " + "\n--Marca:" + marca + ", Modelo:" + modelo +  ", Año:" + anio 
                + ", \n--Numero de motor:" + numerodeMotor + ", Numero de chasis:" + numerodeChasis + ", Color:" + color + ",  Tipo de vehiculo:" + tipodeVehiculo ;
    }
    

}
