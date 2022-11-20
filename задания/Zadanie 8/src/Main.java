import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 100;
        System.out.println("1.Вишня\n"+"2.Брусника\n"+"3.Крыжовник\n"+"4.Земляника садовая\n"
                +"5.Малина садовая\n"+"6.Ежевика садовая\n"+"7.Голубика\n"+"8.Клюква");
        while (!(x>0 & x<9)) {
            System.out.println("Введите номер ягоды (>=1;<=8)");
            x = in.nextInt();
        }
        switch (x) {
            case 1:
                System.out.println("Вишня содержит 12.8г сахара");
                break;
            case 2:
                System.out.println("Брусника содержит 9г сахара");
                break;
            case 3:
                System.out.println("Крыжовник содержит 8.2г сахара");
                break;
            case 4:
                System.out.println("Земляника садовая содержит 7.8г сахара");
                break;
            case 5:
                System.out.println("Малина садовая содержит 7.3г сахара");
                break;
            case 6:
                System.out.println("Ежевика садовая содержит 7.25г сахара");
                break;
            case 7:
                System.out.println("Голубика содержит 7г сахара");
                break;
            case 8:
                System.out.println("Клюква содержит 3.6г сахара");
                break;
        }
    }
}
