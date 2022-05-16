package codeForce;

import java.util.Scanner;

public class PetyaStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringOne = sc.nextLine();
        String stringTwo = sc.nextLine();
        int compare = stringOne.compareToIgnoreCase(stringTwo);
        if(compare < 0) {
            compare = -1;
        } else if(compare > 0){
            compare =1;
        }
        System.out.println(compare);
        sc.close();
    }

}
