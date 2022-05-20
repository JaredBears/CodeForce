package codeForce;

import java.util.*;

public class SoldierBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int dollars = sc.nextInt();
        int desired = sc.nextInt();
        int totalCost = 0;
        for(int i = 1; i <= desired; i++) {
            totalCost += (cost * i);
        }
        int borrowed = totalCost - dollars;
        if(borrowed < 0) {
            borrowed = 0;
        }
        System.out.println(borrowed);
        sc.close();
    }

}
