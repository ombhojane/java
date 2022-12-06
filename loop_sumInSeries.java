import java.util.Scanner;
// Print Sum of input numbers until -1 comes
class loop_sumInSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        while(n != -1){
        sum += n;
        n++;
         n = sc.nextInt();
        }
        System.out.print(sum);
        
    }
}
