import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // değişkenler
        int number, counter = 0;

        // kullanıcıdan veri girişi
        System.out.print("enter number: ");
        number = inp.nextInt();

        // eğer number i'ye kalansız bölünüyorsa bu sayıyı toplayıp counter'a atayacak
        for (int i = 1 ; i<number; i++){
            if (number % i == 0){
                counter += i;


            }

        }

        //  kullanıcıya çıktı veren kısım
        if (counter==number){
            System.out.println(number + " mükemmel sayıdır.");
        }else System.out.println(number + " mükemmel sayı değildir");



    }
}
