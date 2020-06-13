package basicsOfSoftwareCodeDevelopment.part1.cycles;

import java.util.ArrayList;
import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number");
        String num1 = scanner.nextLine();
        System.out.println("Please, enter second number");
        String num2 = scanner.nextLine();

        char[] numsOfNum1 = num1.toCharArray();
        char[] numsOfNum2 = num2.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
//        char[] result = new char[10];

        for (char ch1: numsOfNum1) {
            for (char ch2: numsOfNum2) {
                if(ch2==ch1){
                    if(result.indexOf(ch2)==-1){
                        result.add(ch2);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
