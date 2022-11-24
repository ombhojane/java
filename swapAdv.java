import java.util.Scanner;

import java.util.*;
public class swapAdv {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swapping/na to = "+a+"\n +b ");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping/na to = "+a+"\n +b ");

    }
}
