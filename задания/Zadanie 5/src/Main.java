import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты х");
        double x = in.nextDouble();
        System.out.println("Введите координаты y");
        double y = in.nextDouble();
        if ((x>=-1 & y>=2.5*x+3.5 & y<=-1.5*x+3.5) | (x<=0 & y<=2.5*x+3.5 & y>=-2*x-1) | (x>=0 & y<=-1.5*x+3.5 & y>=3*x-1)
                | (y>=-1 & y<=x-3 & y<=-1f/3*x+1) | (y<=0 & y>=x-7 & y>=-1f/3*x+1) | (y>=0 & y>=-x+3 & y<=-0.2*x+1.4)
                | (pow((x+1),2)+pow((y-3),2)<=4 & x<=-1) | (pow((x-4),2)+pow((y+1),2)<=4 & y<=-1)) {
            System.out.println("Точка попала в область");
        }
        else {
            System.out.println("Точка не попала в область");
        }
    }
}