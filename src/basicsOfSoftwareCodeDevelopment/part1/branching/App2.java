package basicsOfSoftwareCodeDevelopment.part1.branching;

/*Найти max{min(a, b), min(c, d)}*/
public class App2 {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        int c=3;
        int d=2;
        int max;
        int minFromAb;
        int minFromCd;

//    First variant
        if(a<b){
            minFromAb = a;
        }else {
            minFromAb=b;
        }

        if(c<d){
            minFromCd=c;
        }else {
            minFromCd=d;
        }
        if(minFromAb>minFromCd){
            max = minFromAb;
        }else {
            max=minFromCd;
        }
//        Second variant
        Integer secondMax= Integer.max(Integer.min(a,b),Integer.min(c,d));
    }
}
