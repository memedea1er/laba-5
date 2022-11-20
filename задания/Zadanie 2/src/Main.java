import java.util.*;
public class Main {
    public static void main(String[] args) {
        int m=0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 0<=М<=45");
            m = in.nextInt();
            if(m>=0 & m<=45){
                break;
            }
        }
        Integer[] abcde = new Integer[5];
        int i=1;
        while (i<6) {
            System.out.println("Введите число №" + i + " 10000<=x<=99999");
            int x = in.nextInt();
            if (x >= 10000 & x <= 99999) {
                abcde[i-1] = x;
                i++;
                }
            }
        ArrayList<Integer> sumi = new ArrayList();
        for (i=0;i<5;i++){
            int sum=0,n=abcde[i];
            while(n != 0){
                sum += (n % 10);
                n/=10;
            }
            if(sum>m){
                sumi.add(sum);
            }
        }
        Collections.sort(sumi,Collections.reverseOrder());
        for (i = 0; i < sumi.size(); i++) {
            System.out.printf(sumi.get(i) + " ");
        }
    }
}