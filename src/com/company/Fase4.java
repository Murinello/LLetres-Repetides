/*
                                            Fase 4

    Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
    Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona.
    És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
	FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
 */

package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Fase4 {

    public static void main(String[] args) {

        String name = "Pedro";
        String surname = "Murinelo";

        String str1[] = name.split("");
        String str2[] = surname.split("");

        List<String> myname = new ArrayList<>();
        myname = Arrays.asList(str1);

        List<String> mysurname = new ArrayList<>();
        mysurname = Arrays.asList(str2);

        LinkedList mylinkedname = new LinkedList(Arrays.asList(str1));
        LinkedList mylinkedsurname = new LinkedList(Arrays.asList(str2));

        LinkedList <String> fullname = new LinkedList();
        fullname.addAll(Arrays.asList(str1));
        fullname.add(" ");
        fullname.addAll(Arrays.asList(str2));

        System.out.print("FullName: " + fullname);

        }

}