/**
 *                                Fase 3
 *
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades
 * que apareixen
 *
 */

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase3 {

    public static void main(String[] args) {

        String list = "Pedro Murinelo";

        // Convert string to a List of Characters
        List<Character> chars = new ArrayList<>();
        for (char i: list.toCharArray()) {
            chars.add(i);
        }

        //Map declaration & assignment
        Map<Character, Integer> map = new HashMap<>();

        //Mapping the characters of the list and the number of times each character appear
        for(char key : chars){
            int i = 1;
            if (map.containsKey(key)){
                i = map.get(key);
                i++;
            }
            map.put(key, i);
        }

        //Displaying the number of times a character appear
        for ( Character key : map.keySet()) {
            System.out.println("Character : '" + key + "' Count :" + map.get(key));
        }
    }
}
