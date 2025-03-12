package org.example;

import java.util.List;

public class Cabinas {
    String codigoCabina;
    int numTotalLlamadas;
    double duracionTotalLlamadas;
    int costoTotalLlamadas;
    List<Llamadas> llamadas;

    public Cabinas() {
    }

    public Cabinas(String codigoCabina, int numTotalLlamadas, double duracionTotalLlamadas, int costoTotalLlamadas, List<Llamadas> llamadas) {
        this.codigoCabina = codigoCabina;
        this.numTotalLlamadas = numTotalLlamadas;
        this.duracionTotalLlamadas = duracionTotalLlamadas;
        this.costoTotalLlamadas = costoTotalLlamadas;
        this.llamadas = llamadas;
    }

    public String getCodigoCabina() {
        return codigoCabina;
    }

    public void setCodigoCabina(String codigoCabina) {
        this.codigoCabina = codigoCabina;
    }

    public int getNumTotalLlamadas() {
        return numTotalLlamadas;
    }

    public void setNumTotalLlamadas(int numTotalLlamadas) {
        this.numTotalLlamadas = numTotalLlamadas;
    }

    public double getDuracionTotalLlamadas() {
        return duracionTotalLlamadas;
    }

    public void setDuracionTotalLlamadas(double duracionTotalLlamadas) {
        this.duracionTotalLlamadas = duracionTotalLlamadas;
    }

    public int getCostoTotalLlamadas() {
        return costoTotalLlamadas;
    }

    public void setCostoTotalLlamadas(int costoTotalLlamadas) {
        this.costoTotalLlamadas = costoTotalLlamadas;
    }

    public List<Llamadas> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(List<Llamadas> llamadas) {
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return "Cabinas{" +
                "codigoCabina='" + codigoCabina + '\'' +
                ", numTotalLlamadas=" + numTotalLlamadas +
                ", duracionTotalLlamadas=" + duracionTotalLlamadas +
                ", costoTotalLlamadas=" + costoTotalLlamadas +
                ", llamadas=" + llamadas +
                '}';
    }

    public void datosCabina(){
        System.out.println("\tDATOS DE LA CABINA");
        System.out.println("Codigo Cabina: " + codigoCabina);
        System.out.println("Numero Total Llamadas: " + numTotalLlamadas);
        System.out.println("Duracion Total: " + duracionTotalLlamadas + " minutos");
        System.out.println("Costo Total: " + costoTotalLlamadas);
    }

    public void costoPorCabina(List<Llamadas> llamadas){

        this.costoTotalLlamadas = 0;
        this.duracionTotalLlamadas = 0;

        for(int i = 0; i < llamadas.size(); i++){
            this.costoTotalLlamadas += llamadas.get(i).getCostoLlamada();
            this.duracionTotalLlamadas += llamadas.get(i).getDuracionLlamada();
        }
    }

}
