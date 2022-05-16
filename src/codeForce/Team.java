package codeForce;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSubmitted = 0;
        int counter = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < counter; i++) {
            String entry = sc.nextLine();
            int petya = Character.getNumericValue(entry.charAt(0));
            int vasya = Character.getNumericValue(entry.charAt(2));
            int tonya = Character.getNumericValue(entry.charAt(4));
            if(petya + vasya + tonya >= 2) {
                numSubmitted += 1;
            }
        }
        System.out.println(numSubmitted);
        sc.close();
    }
}
