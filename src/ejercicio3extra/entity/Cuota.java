
package ejercicio3extra.entity;

import ejercicio3extra.Enum.FORMADEPAGO;
import ejercicio3extra.Enum.NUMERODECUOTA;
import java.util.Date;

public class Cuota {
    
    private NUMERODECUOTA numerodeCuota;
    private Double montoCuota;
    private Boolean pagada;
    private Date fechaVencimiento = new Date();
    private FORMADEPAGO formadePago;

    public Cuota() {
        
    }

    public Cuota(NUMERODECUOTA numerodeCuota, Double montoCuota, Boolean pagada, Date fechaVencimiento, FORMADEPAGO formadePago) {
        this.numerodeCuota = numerodeCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formadePago = formadePago;
    }
    

    public NUMERODECUOTA getNumerodeCuota() {
        return numerodeCuota;
    }

    public void setNumerodeCuota(NUMERODECUOTA numerodeCuota) {
        this.numerodeCuota = numerodeCuota;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FORMADEPAGO getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(FORMADEPAGO formadePago) {
        this.formadePago = formadePago;
    }

    @Override
    public String toString() {
        return "CUOTA: " + "\n--Numero de cuota: " + numerodeCuota + ", Monto cuota: $" + montoCuota + ",  Pagada: " + pagada 
                + ",\n --Fecha vencimiento: " + fechaVencimiento + ", Forma de pago: " + formadePago ;
    }


}
