package codeForce;

import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] board = input.split(" ");
        int width = Integer.parseInt(board[0]);
        int height = Integer.parseInt(board[1]);
        int area = width * height;
        int dominos = area / 2;
        System.out.println(dominos);
        sc.close();
    }

}
