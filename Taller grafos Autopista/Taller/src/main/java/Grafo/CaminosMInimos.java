/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class CaminosMInimos {
    //metodo para determinar todos los caminos 

    public String algoritmoFloid(long[][] mAdy) {

        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminosRecorridos = "", cadena = "", caminitos = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;

        //inicializar la matrices caminos y caminos auxiliares
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }

        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 = temporal3;
                    //encontrar minimo     
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminosRecorridos = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminosRecorridos) + (k + 1);
                        }
                    }

                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }

        //agregando el camino a cadena
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";

            }
            cadena = cadena + "\n";
        }

        ///////////////////////////////////////
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1)
                                    + ") irse por...(" + (i + 1) + ", "
                                    + (j + 1) + ")\n";
                        } else {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1)
                                    + ") irse por...(" + (i + 1) + ", "
                                    + caminos[i][j] + ", " + (j + 1) + ")\n";
                        }

                    }
                }
            }
        }
       
    }
    
    //llegue hasta el minuto 22:54 del video,para no dejar el metodo anterior incompleto
    //:D
    
}
