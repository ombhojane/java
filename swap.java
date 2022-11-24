import java.util.*;;

public class swap {
    public static void main(String[] args) {
        int a, b, swap;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("First int swaped to/na = " + a + "\nb = " + b);

        /*
          swap = a;
          a = b;
          b = swap;
         */

        System.out.println("Secont int swaped to/na = " + b + "\nb = " + a);
    }
}
