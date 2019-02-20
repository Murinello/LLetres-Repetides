/**           Fase 2
 Canvia la taula per una llista (List<Character>)

 Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix:
 ‘CONSONANT’.

 Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen
 números!’.

 */

package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;
import static java.lang.Character.isSpaceChar;


public class Fase2 {

    public static void main(String[] args) {

        String name = "Pedro 2 Murinelo";

        // Convert string to lowercase characters
        String lowerCaseName = name.toLowerCase();

        // Convert string to a List of Characters
        List<Character> chars = new ArrayList<>();
        for (char i: lowerCaseName.toCharArray()) {
            chars.add(i);
        }

        for (int i = 0; i < lowerCaseName.length(); i++) {
            if (isVowel(lowerCaseName.charAt(i))) {
                System.out.println( "\"" + lowerCaseName.charAt(i) + "\": vocal");
            } else if (isDigit(lowerCaseName.charAt(i))){
                System.out.println( "\"" + lowerCaseName.charAt(i) + "\": els noms de persones no contenen números!");
            } else if (isSpaceChar(lowerCaseName.charAt(i))){
                System.out.println( "\"" + lowerCaseName.charAt(i) + "\": espacio");
            } else {
                System.out.println( "\"" + lowerCaseName.charAt(i) + "\": consonant");
            }
        }
    }

    // Returns whether the given character is a vowel
    public static boolean isVowel(char letter) {
        return (letter == 'a' || letter == 'e' || letter == 'i' ||
                letter == 'o' || letter == 'u');
    }

}
