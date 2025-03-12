package org.example;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = true;
        int opcion = 0;
        //Cabinas cabinas = new Cabinas();
        Llamadas llamada1 = new Llamadas();
        String codigoTemporal = "";
        int tipoLlamada = 0;
        double duracionLlamada = 0.0;

        List<Cabinas> listCabinas = new ArrayList<>();
        List<Llamadas> listaLlamadas = new ArrayList<>();



        do{
            int cabinaExiste = -1;
            double costoTotal = 0.0;
            System.out.println("==================================================");
            System.out.println("\tBIENVENIDO AL SISTEMA DE COSTOS DE LLAMADAS" +
                    "\n1. Crear una cabina telefonica" +
                    "\n2. Registrar una llamada en la cabina" +
                    "\n3. Mostrar la informacion de una cabina" +
                    "\n4. Consolidado de informacion de las cabinas" +
                    "\n5. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    System.out.println("Ingrese el codigo de la cabina telefonica");
                    codigoTemporal = sc.next();
                    cabinaExiste = buscarCabinas(codigoTemporal, listCabinas);
                    if(cabinaExiste >= 0){
                        System.out.println("El codigo de la cabina telefonica ya existe");
                    }
                    if (cabinaExiste == -1) {
                        Cabinas cabina = new Cabinas(codigoTemporal, 0, 0, 0, listaLlamadas);
                        listCabinas.add(cabina);
                        System.out.println("Cabina creada con exito");
                        cabina.datosCabina();
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el codigo de la cabina telefonica en la que desea registrar la llamada");
                    codigoTemporal = sc.next();
                    cabinaExiste = buscarCabinas(codigoTemporal, listCabinas);
                    if(cabinaExiste >= 0) {
                        try {
                            System.out.println("Ingrese el tipo de llamada" +
                                    "\n1. Local" +
                                    "\n2. Larga distancia" +
                                    "\n3. Celular");
                            tipoLlamada = sc.nextInt();
                            System.out.println("Ingrese la duracion de la llamada en minutos");
                            duracionLlamada = sc.nextDouble();
                        }catch (ArithmeticException e){
                            System.out.println(e.getMessage());
                        }
                        llamada1.crearLlamada(tipoLlamada, duracionLlamada);
                        llamada1.datosLlamadas();
                        listaLlamadas.add(llamada1);
                        listCabinas.get(cabinaExiste).setLlamadas(listaLlamadas);


                    }

                    if (cabinaExiste == -1) {
                        System.out.println("El codigo de la cabina " + codigoTemporal + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el codigo de la cabina telefonica");
                    codigoTemporal = sc.next();
                    cabinaExiste = buscarCabinas(codigoTemporal, listCabinas);
                    if(cabinaExiste >= 0){
                        listCabinas.get(cabinaExiste).costoPorCabina(listaLlamadas);
                        listCabinas.get(cabinaExiste).datosCabina();
                    }
                    if (cabinaExiste == -1) {
                        System.out.println("El codigo de la cabina " + codigoTemporal + " no existe");
                    }
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Saliendo....");
                    salir = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(salir);
    }

    public static int buscarCabinas(String codigoBusqueda, List<Cabinas> listaCabinas) {
        for (int i = 0; i < listaCabinas.size(); i++){
            if (codigoBusqueda.equals(listaCabinas.get(i).getCodigoCabina())){
                return i;
            }
        }
        return -1;
    }

}