import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        if (x<-1) {
            System.out.println("y(x)=" + abs(exp(1) - PI* x));
        }
        else if (x>-1 & x<4) {
            System.out.println(pow(x,2*x-5)-5);
        }
        else if (x>4) {
            System.out.println((4-x)/(pow(x,2)-1));
        }
        else if (x==-1 | x==4) {
            System.out.println(exp(1));
        }
    }
}