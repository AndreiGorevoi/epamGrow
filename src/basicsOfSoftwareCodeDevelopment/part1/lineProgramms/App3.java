package basicsOfSoftwareCodeDevelopment.part1.lineProgramms;
import static java.lang.Math.*;

/*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
∗ 𝑡𝑔 𝑥�*/
public class App3 {


    public static void main(String[] args) {
        double x = 0.5;
        double y = 1;
        double result;

        result=((sin(x)+cos(y))/(cos(x)-sin(y)))*tan(x*y);
        System.out.println(result);
    }
}
