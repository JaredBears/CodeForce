package codeForce;

import java.util.*;

public class Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int steps = weight / 5;
        if(weight % 5 > 0) {
            steps += 1;
        }
        System.out.println(steps);
        sc.close();
    }

}
