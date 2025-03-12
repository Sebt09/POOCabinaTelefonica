package org.example;

public class Llamadas {
    int tipoLlamada;
    double costoLlamada;
    double duracionLlamada;

    public Llamadas() {
    }

    public Llamadas(int tipoLlamada, double costoLlamada, double duracionLlamada) {
        this.tipoLlamada = tipoLlamada;
        this.costoLlamada = costoLlamada;
        this.duracionLlamada = duracionLlamada;
    }

    public int getTipoLlamada() {
        return tipoLlamada;
    }

    public void setTipoLlamada(int tipoLlamada) {
        this.tipoLlamada = tipoLlamada;
    }

    public double getCostoLlamada() {
        return costoLlamada;
    }

    public void setCostoLlamada(int costoLlamada) {
        this.costoLlamada = costoLlamada;
    }

    public double getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(double duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }

    @Override
    public String toString() {
        return "Llamadas{" +
                "tipoLlamada='" + tipoLlamada + '\'' +
                ", costoLlamada=" + costoLlamada +
                ", duracionLlamada=" + duracionLlamada +
                '}';
    }

    public void datosLlamadas(){
        System.out.println("--------------------------");
        System.out.println("DATOS DE LA LLAMADA CREADA");
        if (tipoLlamada == 1){
            System.out.println("Tipo Llamada: Local");
            System.out.println("Costo Llamada: " + costoLlamada);
            System.out.println("Duracion Llamada: " + duracionLlamada);
        }
        if (tipoLlamada == 2){
            System.out.println("Tipo Llamada: Larga Distancia");
            System.out.println("Costo Llamada: " + costoLlamada);
            System.out.println("Duracion Llamada: " + duracionLlamada);
        }
        if (tipoLlamada == 3){
            System.out.println("Tipo Llamada: Celular");
            System.out.println("Costo Llamada: " + costoLlamada);
            System.out.println("Duracion Llamada: " + duracionLlamada);

        }
    }

    public void crearLlamada(int tipoLlamada, double duracionLlamada){
        if (tipoLlamada == 1){
            this.tipoLlamada = 1;
            this.costoLlamada = duracionLlamada * 50;
            this.duracionLlamada = duracionLlamada;
        }
        if (tipoLlamada == 2){
            this.tipoLlamada = 2;
            this.costoLlamada = duracionLlamada * 350;
            this.duracionLlamada = duracionLlamada;
        }
        if (tipoLlamada == 3){
            this.tipoLlamada = 3;
            this.costoLlamada = duracionLlamada * 150;
            this.duracionLlamada = duracionLlamada;
        }
    }
}
