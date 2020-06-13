package basicsOfSoftwareCodeDevelopment.part1.branching;

/*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */
public class App3 {
    public static void main(String[] args) {
        App3 app3 = new App3();
//        Координаты точек
        int aX=1;
        int aY=1;
        int bX=2;
        int bY=2;
        int cX=1;
        int cY=3;

        System.out.println(app3.checkLine(aX,aY,bX,bY,cX,cY));

    }
//Проверка на принадлежность 3-й точки к линии проведенной через 1-ю и 2-ю точку
    public boolean checkLine(int aX,int aY, int bX, int bY, int cX, int cY){
        if((cX-aX)/(bX-aX) == (cY-aY)/(bY-aY)){
            return true;
        }

        return false;
    }
}
