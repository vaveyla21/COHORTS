import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        double pi = 3.14, alan, cevre;
        int r;

        // yarıçap bilgisinin alındığı kısım
        System.out.print("yarıçap giriniz: ");
        r = inp.nextInt();

        // dairenin alanı
        alan = pi*r*r;
        System.out.println("dairenin alanı: " + alan);

        // dairenin çevresi
        cevre = 2*pi*r;
        System.out.print("dairenin çevresi: " + cevre);


    }
}
