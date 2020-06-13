package basicsOfSoftwareCodeDevelopment.part1.branching;

/*Вычислить значение функции:*/
public class App5 {

    public double function(double x){
        if(x<=3){
            return Math.pow(x,2)-3*x+9;
        }else {
            return 1/(Math.pow(x,3)+6);
        }
    }
}
