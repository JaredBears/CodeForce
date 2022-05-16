package codeForce;

import java.util.Scanner;

public class BitPlusPlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int runs = Integer.parseInt(sc.nextLine());
        String[] commands = new String[runs];
        for(int i = 0; i < runs; i++) {
            commands[i] = sc.nextLine();
        }
        for(String command : commands) {
            if(command.equalsIgnoreCase("x++") || command.equalsIgnoreCase("++x")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }

}
