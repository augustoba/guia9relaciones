
package ejercicio2.entitiy;

public class Revolver {
    
    private Integer posicionActual;
    private Integer PosicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer PosicionAgua) {
        this.posicionActual = posicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(Integer PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }
    

}
