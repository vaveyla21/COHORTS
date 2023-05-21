import java.util.Scanner;
public class Main {

    // metodu tanımladığımız yer. Değişkenler metod içine tanımlanmıştır
    static int power (int base, int pow){
        int total = 1;

// for döngüsünü üstteki (pow) sayı kadar döndürerek altaki (base) sayıyı çarpıyor.
        for (int i = 1 ; i<=pow; i++){
            total *= base;
        }
        return total;
    }

    // main metodumuzun olduğu yer
    public static void main(String[] args) {

        // geriye sadece metodu çağırıp değişkenleri girmek kalıyor.
        System.out.println(power(2,3));
    }
}
