import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        System.out.println(g(x) + " " + z(x));
    }
    public static double g(double x) {
        if (x<=0) {
            return (cos(sin(cos(pow(x,2)+2*x)))+PI*exp(1));
        }
        else {
            return (exp(pow((1+2*x)/(1+pow(x,2)),1f/2)));
        }
    }
    public static double z(double x) {
        if (x<0) {
            return (tan(x)+cos(pow(1+pow(x,2),1f/2)));
        }
        else if (x>=0 & x<=1) {
            return (2*pow(x,6)+pow(x,4)-2*cos(x)*exp(-2*x));
        }
        else {
            return (2*sin(cos(x))-(pow(x,3)+x)/(2*cos(x+1)+2));
        }
    }
}