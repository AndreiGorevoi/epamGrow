package basicsOfSoftwareCodeDevelopment.part1.lineProgramms;


/*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑏 + √𝑏
2 + 4𝑎𝑐
2𝑎
− 𝑎
3
𝑐 + 𝑏
−2
*/
public class App2 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=10;
        double result;
        result=(b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a,3)*c + Math.pow(b,-2);
    }
}
