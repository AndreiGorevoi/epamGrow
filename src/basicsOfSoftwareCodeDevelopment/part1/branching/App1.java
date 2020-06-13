package basicsOfSoftwareCodeDevelopment.part1.branching;

/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/
public class App1 {
    public static void main(String[] args) {
        int firstCorner = 40;
        int secondCorner = 50;

        if(firstCorner+secondCorner>180 || firstCorner<0 || secondCorner<0){
            System.out.println("Impossible to draw a triangle");
        }else {
            if(firstCorner==90 || secondCorner==90 || 180-(firstCorner+secondCorner)==90){
                System.out.println("Possible to draw a rectangular triangle");
            }else {
                System.out.println("Possible to draw a no rectangular triangle");
            }
        }
    }
}
