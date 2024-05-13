/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.obligatoriojuanes;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Obligatoriojuanes {

    public static void main(String[] args) {

        // cargamos las listaas negra y blanca de los archivos
        Lista<Integer> listaBlanca = new Lista<>();
        Lista<INodo> listaNegra = new Lista<>();
        Lista<INodo> listaSueros = new Lista<>();
        Lista<INodo> listaFarmacos = new Lista<>();
        Lista<INodo> listaFarmacosConsulta = new Lista<>();

        String[] archivoListaBlanca = ManejadorArchivosGenerico
                .leerArchivo("src\\main\\java\\com\\mycompany\\obligatoriojuanes\\txt\\listablanca.txt");
        String[] archivoListaNegra = ManejadorArchivosGenerico
                .leerArchivo("src\\main\\java\\com\\mycompany\\obligatoriojuanes\\txt\\listanegra.txt");
        String[] archivoSueros = ManejadorArchivosGenerico
                .leerArchivo("src\\main\\java\\com\\mycompany\\obligatoriojuanes\\txt\\Sueros.txt");
        String[] archivoFarmacos = ManejadorArchivosGenerico
                .leerArchivo("src\\main\\java\\com\\mycompany\\obligatoriojuanes\\txt\\farmacos.txt");

        for (int i = 0; i < archivoSueros.length; i++) {
            String[] parts = archivoSueros[i].split(",");
            listaSueros.insertar(new Nodo(new Suero(parts[0].trim(), parts[1].trim()), parts[0].trim()));
        }

        for (int i = 0; i < archivoFarmacos.length; i++) {
            String[] parts = archivoFarmacos[i].split(",");
            listaFarmacos.insertar(new Nodo(new Farmaco(parts[0].trim(), parts[1].trim()), parts[0].trim()));
        }

        for (int i = 0; i < archivoListaBlanca.length; i++) {
            String[] parts = archivoListaBlanca[i].split(",");
            String idFarmaco = parts[0].trim();
            if (listaFarmacos.buscar(idFarmaco) != null) {
                listaBlanca.insertar(new Nodo(archivoListaBlanca[i], archivoListaBlanca[i]));
            }
        }

        for (int i = 0; i < archivoListaNegra.length; i++) {
            String[] parts = archivoListaNegra[i].split(",");
            String idSuero = parts[0].trim();
            String idFarmaco = parts[1].trim();
            if (listaSueros.buscar(idSuero) != null && listaFarmacos.buscar(idFarmaco) != null) {
                listaNegra.insertar(new Nodo(parts[0].trim(), parts[1].trim()));
            }
        }

        Preparado preparado = new Preparado(listaBlanca, listaNegra);
        System.out.print("Ingrese id del suero que desea en el preparado: ");
        Scanner input = new Scanner(System.in);
        String idSuero = input.nextLine();
        if (listaSueros.buscar(idSuero) == null) {
            System.out.println("No existe suero con ese id");
            return;
        }
        Suero miSuero = (Suero) listaSueros.buscar(idSuero).getDato();
        System.out.print("Ingrese cantidad de farmacos a utilizar: ");
        Scanner cantidad = new Scanner(System.in);
        int cant = cantidad.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese identificador de farmaco: ");
            Scanner id = new Scanner(System.in);
            String idFar = id.nextLine();
            if (listaFarmacos.buscar(idFar) == null) {
                System.out.print("No existe farmaco con ese indentificador ");
                return;
            } else {
                Farmaco farm = (Farmaco) listaFarmacos.buscar(idFar).getDato();
                String descripcion = farm.getDescripcion();
                listaFarmacosConsulta.insertar(new Nodo(new Farmaco(idFar, descripcion), idFar));
            }
        }
        
        System.out.println(miSuero.imprimir()); // se imprime el suero a usar
        System.out.println(listaFarmacosConsulta.imprimirLista()); // se imprime la lista de farmacos a usar
        if (preparado.preparadoViable(miSuero, listaFarmacosConsulta)) { // se imprime si es viable o no
            System.out.println("Preparado viable\n");
        } else {
            System.out.println("Preparado no viable\n");
        }
    }
}
