package codeForce;

import java.util.*;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] formula = sc.nextLine().split("\\+");
        Arrays.sort(formula);
        String result = "";
        for(int i = 0; i < formula.length; i++) {
            if(i == 0) {
                result += formula[i];
            } else {
                result += "+" + formula[i];
            }
        }
        System.out.println(result);
        sc.close();
    }

}
