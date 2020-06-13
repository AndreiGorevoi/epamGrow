package basicsOfSoftwareCodeDevelopment.part1.lineProgramms;

import java.util.Date;


/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
public class App5 {
    public static void main(String[] args) {
        int t=5000;
        Date date = new Date();
        date.setTime(t);
        System.out.println(String.format("%tr", date));

    }
}
