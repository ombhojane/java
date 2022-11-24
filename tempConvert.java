import java.util.*;
public class tempConvert {
    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Temperature in Celcius:");
        float Celcius = sc.nextFloat();
        System.out.println((Celcius+32)*1.5);
        
    }
}
