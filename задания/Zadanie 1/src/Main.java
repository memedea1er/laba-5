import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> abc = new ArrayList();
        System.out.println("Введите x");
        double x = in.nextInt();
        if(x!=1) {
            abc.add(sin(cos(x)) / (x - 1));
        }
        else{
            System.out.println("выражение 1 недействительно");
        }
        abc.add(pow(cos(x),2));
        if(x>exp(2)) {
            abc.add(log(x - exp(2)));
        }
        else{
            System.out.println("выражение 3 недействительно");
        }
        Collections.sort(abc);
        for (int i = 0; i < abc.size(); i++) {
            System.out.printf(abc.get(i)+" ");
        }
        }
    }