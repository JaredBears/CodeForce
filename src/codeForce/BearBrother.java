package codeForce;

import java.util.*;

public class BearBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int years = 0;
        do {
            limak *= 3;
            bob *= 2;
            years += 1;
        } while (limak <= bob);
        System.out.println(years);
        sc.close();
    }
}
