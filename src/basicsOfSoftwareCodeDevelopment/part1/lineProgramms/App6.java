package basicsOfSoftwareCodeDevelopment.part1.lineProgramms;

/*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */
public class App6 {
    public static void main(String[] args) {
        boolean result = false;
        int x =-2;
        int y =2;

        if(y>0){
            if(x>=-2 && x <=2 && y<=4){
                result = true;
            }
        }else {
            if(x>=-4 && x<=4 && y>=-3){
                result = true;
            }
        }
        System.out.println(result);

    }
}
