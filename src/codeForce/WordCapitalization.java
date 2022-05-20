package codeForce;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        word = String.valueOf(chars);
        System.out.println(word);
        sc.close();
    }

}
