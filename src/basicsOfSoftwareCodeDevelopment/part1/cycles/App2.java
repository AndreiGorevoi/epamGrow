package basicsOfSoftwareCodeDevelopment.part1.cycles;

/*2. Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class App2 {
    public void function(int a, int b, int h){
        for (int i = a; i <=b ; i+=h) {
            if(i>2){
                System.out.println("|x = " + i + " | y= " + i +" |");
            }else {
                System.out.println("|x = " + i + " | y= " + -i +" |");
            }
        }
    }
}
