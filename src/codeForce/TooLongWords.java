package codeForce;

import java.util.Scanner;

public class TooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = Integer.parseInt(sc.nextLine());
        String[] words = new String[counter];
        for(int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }
        for(String word : words) {
            if(word.length() > 10) {
                int number = word.length() - 2;
                String abrev = Character.toString(word.charAt(0)) + number + Character.toString(word.charAt(word.length() - 1));
                System.out.println(abrev);
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }


}
