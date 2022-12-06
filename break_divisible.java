// to print no divisible by 5 & 7
import java.util.Scanner;
class break_divisible {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 1;
        while(true){
            if((n % 5 == 0) && (n % 7 == 0)){
                System.out.print("Found No" + n);
                break;
            } n++;
        } 
    } 
}
