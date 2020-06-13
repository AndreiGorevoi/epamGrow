package basicsOfSoftwareCodeDevelopment.part1.cycles;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        char[] chars = text.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]+ " - "+Character.getNumericValue(chars[i]));
        }
    }
}
