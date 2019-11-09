/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06.pkg1;

import java.util.Arrays;

/**
 *
 * @author Mert Yacan
 */
public class Assignment6_2 {

    public static void main(String[] args) {

        String[] words = {"Dedu ctio ns", "Dis cou nted", "Dis count er", "i ntr od uces",
            "r educ ti On s", "harm oNic as", "mARa schi no", "pE rcu ssi on", "Su pers onic"};

        int selectedwordnum = (int) (Math.random() * 9);
        String selectedword = words[selectedwordnum];
        selectedword = selectedword.replace(" ", "");
        selectedword = selectedword.toLowerCase();
        System.out.println("Selected word is: " + selectedword);

        int[] alphabetSelectedArray = new int[26];
        for (int i = 0; i < selectedword.length(); i++) {
            char ch = selectedword.charAt(i);
            int value = (int) ch;
            if (value >= 97 && value <= 122) {
                alphabetSelectedArray[ch - 'a']++;
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (i == selectedwordnum) {
                continue;
            }
            String anotherword = words[i];
            anotherword = anotherword.replace(" ", "");
            anotherword = anotherword.toLowerCase();

            int[] alphabetAnotherArray = new int[26];
            for (int j = 0; j < anotherword.length(); j++) {
                char ch = anotherword.charAt(j);
                int value = (int) ch;
                if (value >= 97 && value <= 122) {
                    alphabetAnotherArray[ch - 'a']++;
                }
            }
            if (Arrays.equals(alphabetSelectedArray, alphabetAnotherArray)) {
                System.out.println("The word " + selectedword + " is anagram of the word: " + anotherword);
            }
        }
        System.out.println("\nThe number of characters are: ");
        for (int t = 0; t < alphabetSelectedArray.length; t++) {
            if (alphabetSelectedArray[t] > 0) {
                char ch = (char) (t + 97);
                System.out.println(ch + "  : " + alphabetSelectedArray[t]);
            }
        }
    }
}
