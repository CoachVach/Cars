package Main.java;

public class Auto {
    private int precio;
    private int kilometros;
    private int gasolina;
    private int capacidad_gasolina;

    public Auto(int precio,int kilometros,int capacidad){
        this.precio = precio;
        this.kilometros = kilometros;
        this.capacidad_gasolina = capacidad;
        this.gasolina = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getGasolina() {
        return gasolina;
    }

    public int getCapacidad() {
        return capacidad_gasolina;
    }

}
