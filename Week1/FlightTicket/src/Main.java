import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        double perkm = 0.10, normalTutar ;
        int year, tip, km;

        // kullanıcıdan alınan veriler
        System.out.print("gidilen mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();
        System.out.print("yaşınızı giriniz: ");
        year = inp.nextInt();
        System.out.println("1-TEK YÖN\t2-GİDİŞ DÖNÜŞ");
        System.out.print("yolculuk tipini seçiniz: ");
        tip = inp.nextInt();

        // bilet fiyatının ve kampanyaların hesaplandığı kısım
        normalTutar = km * perkm; // kampanyasız normal fiyat

        if ((year>0) && (km>0) && ((tip==1) || (tip==2))) {

            if (year <= 12) {
                normalTutar *= (0.20);

            } else if ((year > 12) && (year < 24)) {
                normalTutar *= (0.10);

            } else if (year >= 65) {
                normalTutar *= (0.30);

            }
            if (tip==2){
                normalTutar *=0.20;
            }
            System.out.println("tutar" + normalTutar);
        }else System.out.println("hatalı giriş yaptınız!");

    }
}
