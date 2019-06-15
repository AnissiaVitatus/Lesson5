import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double inc1, inc2, inc3;
        System.out.println("Enter Balance: ");
        double balance = scan.nextDouble();
        inc1 = ((balance*.025) + balance);
        inc2 = ((inc1*.025) + inc1);
        inc3 = ((inc2*.025) + inc2);
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);


    }
}
