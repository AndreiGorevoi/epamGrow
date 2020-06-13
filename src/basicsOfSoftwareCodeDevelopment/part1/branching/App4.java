package basicsOfSoftwareCodeDevelopment.part1.branching;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.*/
public class App4 {

    public boolean checkAhead(int a, int b, int x, int y, int z){
        int squareOfHole = a*b;
        int squareOfBrick1 = x*y;
        int squareOfBrick2 = x*z;
        int squareOfBrick3 = z*y;

        Integer minSquareOfBrick = Integer.min(Integer.min(squareOfBrick1,squareOfBrick2),squareOfBrick3);

        if(minSquareOfBrick>squareOfHole){
            return false;
        }
        return true;

    }

}
