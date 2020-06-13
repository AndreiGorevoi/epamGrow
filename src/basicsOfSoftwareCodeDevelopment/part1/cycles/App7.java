package basicsOfSoftwareCodeDevelopment.part1.cycles;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter m");
        int m = scanner.nextInt();
        System.out.println("Please, enter n");
        int n = scanner.nextInt();

        for (int i = m; i <=n ; i++) {
            String text =i + " is divided on ";
            for (int j = 2 ; j <i ; j++) {
                if(i%j==0){
                     text += j+"; ";
                }
            }
            System.out.println(text);
        }

    }
}
