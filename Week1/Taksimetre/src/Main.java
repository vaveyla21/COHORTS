import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        double gidilenYol, perkm = 2.20, minTutar = 20.0, ucret;

        // yol verisinin alındığı kısım
        System.out.print("gidilen yolu km cinsinden giriniz: ");
        gidilenYol = inp.nextDouble();

        // işlem
        ucret = gidilenYol*perkm;

        // kısa mesafe veya ücretin hesaplandığı kısım
        if (ucret<20){
            System.out.println("ücret: " + minTutar + " tl");
        }else {
            System.out.println("ücret: " + ucret + " tl");
        }


    }
}
