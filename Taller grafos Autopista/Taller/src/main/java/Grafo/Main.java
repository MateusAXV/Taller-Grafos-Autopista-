
package Grafo;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
     long matrizA[][]={{0,3,4,999999999,8,999999999}, {999999999,0,999999999,

            999999999,5,999999999}, {999999999, 999999999, 0, 999999999, 3, 999999999},

            {999999999,999999999,999999999,0,999999999,999999999}, {999999999, 999999999,

                999999999, 7, 0, 3}, {999999999, 999999999, 999999999, 2, 999999999, 0}};

        CaminosMInimos ruta= new CaminosMInimos();

         System.out.println(ruta.algoritmoFloid(matrizA));

    }

}
