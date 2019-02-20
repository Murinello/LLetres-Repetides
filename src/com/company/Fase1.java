/**                        Fase 1
        Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
        Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les
        lletres.
 */
package com.company;

public class Fase1 {

    public static void main(String[] args) {

        String name = "Pedro Murinelo";

        //string to char array
        char[] chars = name.toCharArray();

        //char all index positions
        for (int i = 0; i < (chars.length) ; i++) {
            char a = name.charAt(i);
            System.out.println(a);

        }
    }
}

