/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obligatoriojuanes;

/**
 *
 * @author juana
 */
public class Preparado {

    public Lista<Integer> listaBlanca = new Lista();
    public Lista<INodo> listaNegra = new Lista();

    public Preparado(Lista<Integer> listaBlanca, Lista<INodo> listaNegra) {
        this.listaBlanca = listaBlanca;
        this.listaNegra = listaNegra;
    }

    public boolean preparadoViable(Suero suero, Lista<INodo> farmacos) {

        INodo aux = farmacos.getPrimero();
        Comparable quieroVerLaEtiqueta = aux.getEtiqueta();
        while (aux != null) {
            quieroVerLaEtiqueta = aux.getEtiqueta();
            // si no esta adentro de la lista blanca, entonces no es viable...
            if (listaBlanca.buscar(aux.getEtiqueta()) == null) {
                System.out.println("\nFarmaco no en lista blanca");
                return false;
            }

            /*
             * aca validamos que el farmaco actual este dentro de la lista negra...
             * si no esta, significa que cumple con lo siguiente:
             * Esta dentro de la lista blanca
             * NO esta dentro de la negra
             */
            if (listaNegra.buscar(aux.getEtiqueta()) != null) {

                String idSueroActual = (String) listaNegra.buscar(aux.getEtiqueta()).getDato();
                String idFarmacoActual = (String) listaNegra.buscar(aux.getEtiqueta()).getEtiqueta();

                // validamos si el suero y farmaco actuales estan dentro de la negra, si lo
                // estan, retornamos FALSE
                if (suero.getId().equalsIgnoreCase(idSueroActual)
                        && String.valueOf(aux.getEtiqueta()).equalsIgnoreCase(idFarmacoActual)) {
                    System.out.println("\nCombinacion en lista negra");
                    return false;
                }
            }
            aux = aux.getSiguiente();
        }
        return true;
    }
}