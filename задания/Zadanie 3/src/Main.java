import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        for (Double x=-3.0; x<=3.0; x+=0.5) {
            if (x>=0) {
                System.out.println("f(x)=" + sin(PI)*x);
            }
            else {
                System.out.println("f(x)=" + PI*pow(x,2));
            }
        }
    }
}