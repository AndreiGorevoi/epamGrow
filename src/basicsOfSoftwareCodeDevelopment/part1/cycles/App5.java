package basicsOfSoftwareCodeDevelopment.part1.cycles;

public class App5 {

    public static void main(String[] args) {
        double sum=0;
        double a = 2;
        double e = 1.2;
        int i = 0;

        while (true){
            double tempSum=sum;
            tempSum+=1/Math.pow(a,i);
            if(tempSum<=e){
                sum=tempSum;
            }
            else {
                break;
            }
            i++;
            a++;
        };
    }
}
