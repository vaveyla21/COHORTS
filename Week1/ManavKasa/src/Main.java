import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // değişkenler
        double armut = 2.14 , elma = 3.67, domates = 1.11 , muz = 0.95, patlıcan = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlıcankg, tutar;

        // kullanıcıdan kilo bilgilerinin alındığı kısım
        System.out.print("armut kilosunu giriniz: ");
        armutkg = inp.nextDouble();
        System.out.print("elma kilosunu giriniz: ");
        elmakg = inp.nextDouble();
        System.out.print("domates kilosunu giriniz: ");
        domateskg = inp.nextDouble();
        System.out.print("muz kilosunu giriniz: ");
        muzkg = inp.nextDouble();
        System.out.print("patlıcan kilosunu giriniz: ");
        patlıcankg = inp.nextDouble();


        // tutarı belirleyen kısım
        tutar = (armutkg*armut) + (elmakg*elma) + (domateskg*domates) + (muzkg*muz) + (patlıcankg*patlıcan);
        System.out.println("tutar: " + tutar + " tl" );






    }
}
