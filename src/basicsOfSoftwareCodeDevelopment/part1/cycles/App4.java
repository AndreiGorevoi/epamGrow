package basicsOfSoftwareCodeDevelopment.part1.cycles;

import java.math.BigInteger;

/* Составить программу нахождения произведения квадратов первых двухсот чисел.*/
public class App4 {
    public static void main(String[] args) {
        BigInteger finalResult = new BigInteger("1");

        for (long i = 2; i <=200 ; i++) {
            long squareOfNumber = i*i;
            finalResult = finalResult.multiply(BigInteger.valueOf(squareOfNumber));
        }

        System.out.println(finalResult);
    }
}
