package basicsOfSoftwareCodeDevelopment.part1.cycles;

import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/
public class App1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <=number ; i++) {
            sum+=i;
        }

        System.out.println(sum);
    }

}
