import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты х");
        double x = in.nextDouble();
        System.out.println("Введите координаты y");
        double y = in.nextDouble();
        if (pow(x,2)+pow(y,2)<=36 & x>=0 & !(y<=4 & y>=x+1) & !(y<=-4f/3*x+1 & y>=1f/3*x-4) & !(pow(x-4,2) + pow(y+2,2)<=1)
                & !((pow(x-3,2) + pow(y-1,2)<=4) & !(pow(x-2,2)+pow(y-1,2)<=1))) {
                System.out.println("Точка попала в область");
        }
        else {
            System.out.println("Точка не попала в область");
        }
    }
}