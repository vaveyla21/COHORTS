
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find prime numbers until that number: ");
        int num = input.nextInt();

        // o sayıya kadar
        for(int i = 2; i <= num; i++)
        {
            int factorCount = 0;
            // bu sayının herhangi bir çarpanı olup olmadığını kontrol ediyoruz
            for(int i2= 2; i2<i; i2++)
            {
                if(i % i2 == 0) factorCount++;
            }

            if(factorCount == 0) System.out.print(i + " ");
        }
    }
}
