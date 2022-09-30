package ejercicio3extra.entity;

import ejercicio3extra.Enum.*;
import java.time.LocalDate;
import java.util.Date;

public class Poliza {

    public static int getContadorPoliza() {
        return contadorPoliza;
    }

    public static void setContadorPoliza(int aContadorPoliza) {
        contadorPoliza = aContadorPoliza;
    }

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Cuota cuota;
    private Integer numerodePoliza;
    private LocalDate fechadeInicioPoliza;
    private Date fechafinPoliza;
    private Integer montoTotalAsegurado;
    private Boolean granizo;
    private Integer montoMaxGranizo;
    private TIPODECOBERTURA tipodeCobertura;
    private static int  contadorPoliza;
    
     public Poliza() {
         Poliza.contadorPoliza++;      
        this.numerodePoliza=Poliza.contadorPoliza;
        this.fechadeInicioPoliza=LocalDate.now();
        // System.out.println(this.fechadeInicioPoliza);
        
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, Cuota cuota, Integer numerodePoliza, LocalDate fechadeInicioPoliza, Date fechafinPoliza, Integer montoTotalAsegurado, Boolean granizo, Integer montoMaxGranizo, TIPODECOBERTURA tipodeCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuota = cuota;
        this.numerodePoliza = numerodePoliza;
        this.fechadeInicioPoliza = fechadeInicioPoliza;
        this.fechafinPoliza = fechafinPoliza;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipodeCobertura = tipodeCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public Integer getNumerodePoliza() {
        return numerodePoliza;
    }

    public void setNumerodePoliza(Integer numerodePoliza) {
        this.numerodePoliza = numerodePoliza;
    }

    public LocalDate getFechadeInicioPoliza() {
        return fechadeInicioPoliza;
    }

    public void setFechadeInicioPoliza(LocalDate fechadeInicioPoliza) {
        this.fechadeInicioPoliza = fechadeInicioPoliza;
    }

    public Date getFechafinPoliza() {
        return fechafinPoliza;
    }

    public void setFechafinPoliza(Date fechafinPoliza) {
        this.fechafinPoliza = fechafinPoliza;
    }

    public Integer getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Integer montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public TIPODECOBERTURA getTipodeCobertura() {
        return tipodeCobertura;
    }

    public void setTipodeCobertura(TIPODECOBERTURA tipodeCobertura) {
        this.tipodeCobertura = tipodeCobertura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poliza{ ");
        sb.append("\n").append(cliente);
        sb.append(",\n").append(vehiculo);
        sb.append(",\n").append(cuota);
        sb.append(", Numero de poliza: ").append(numerodePoliza);
        sb.append(", Fecha de inicio de la poliza: ").append(fechadeInicioPoliza);
        sb.append(",\n--Fecha fin de la poliza: ").append(fechafinPoliza);
        sb.append(", montoTotalAsegurado: $").append(montoTotalAsegurado);
        sb.append(",\n--Granizo ").append(granizo);
        sb.append(", Monto maximo por granizo: $").append(montoMaxGranizo);
        sb.append(", Tipo de cobertura: ").append(tipodeCobertura);
        sb.append('}');
        return sb.toString();
    }

    

   
     
}