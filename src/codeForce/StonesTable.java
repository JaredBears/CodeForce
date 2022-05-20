package codeForce;

import java.util.*;

public class StonesTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stonesCount = sc.nextInt();
        sc.nextLine();
        String stonesColor = sc.nextLine();
        System.out.println(removeDup(stonesCount, stonesColor));
        sc.close();

    }

    private static int removeDup(int stonesCount, String stonesColor) {
        int removeCount = 0;
        char lastColor = '*';
        for(int i = 0; i < stonesCount; i++) {
            if(stonesColor.charAt(i) == lastColor) {
                removeCount += 1;
            } else {
                lastColor = stonesColor.charAt(i);
            }
        }
        return removeCount;
    }

}
