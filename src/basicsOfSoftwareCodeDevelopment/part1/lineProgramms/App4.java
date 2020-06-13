package basicsOfSoftwareCodeDevelopment.part1.lineProgramms;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/
public class App4 {
    public static void main(String[] args) {
        double r = 258.487;
        String drob = new String(""+r).substring(3);
        Double newNum = Double.valueOf((int) r + drob);
        System.out.println(newNum);


    }
}
