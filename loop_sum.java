import java.util.Scanner;
//Print sum of n natural numbers
class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;
         for(int num = 1; num <= n; num++){
             sum = sum + num;
         }
         System.out.println(sum);
    }
}
