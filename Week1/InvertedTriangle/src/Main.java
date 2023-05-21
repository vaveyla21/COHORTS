import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // kullanıcıdan basamak sayısını istiyoruz
        System.out.print("enter the number for the triangle: ");
        int number = inp.nextInt();

        // iç içe 2 for (biri x ekseni öteki y ekseni) döngüsü ile üçgeni oluşturuyoruz
        for (int i = 1 ; i<=number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }








    }
}
