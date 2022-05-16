package codeForce;

import java.util.Arrays;
import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String setup = sc.nextLine();
        String[] set = setup.split(" ");
        //int n = Integer.parseInt(set[0]);
        int k = Integer.parseInt(set[1]);
        String scoresEntry = sc.nextLine();
        String[] scoreString = scoresEntry.split(" ");
        int[] scores = new int[scoreString.length];
        int counter = 0;
        for(String score : scoreString) {
            scores[counter] = Integer.parseInt(score);
            counter++;
        }
        Arrays.sort(scores);
        int winners = 0;
        int winningScore = scores[scores.length - k];
        for(int score : scores) {
            if(score >= 1 && score >= winningScore) {
                winners++;
            }
        }
        System.out.println(winners);
        sc.close();
    }

}
