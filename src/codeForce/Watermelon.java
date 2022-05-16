package codeForce;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter Weight: ");
        int weight = sc.nextInt();
        if(1<= weight && weight <= 100) {
            if(weight % 2 == 0 && weight != 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Invalid weight");
        }
        sc.close();
    }
}
