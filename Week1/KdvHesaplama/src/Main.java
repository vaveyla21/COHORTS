import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // değişkenler  (kdv oranı %18)
        double miktar, kdv = 0.18, kdvTutar, tutar ;

        // kullanıcıdan alınan veri
        System.out.println("miktar giriniz: ");
        miktar = inp.nextDouble();

        System.out.println("kdv oranı: " + kdv);

        kdvTutar=miktar*kdv;
        System.out.println("KDV tutarı: " + kdvTutar);


        tutar = miktar+kdvTutar;
        System.out.println("KDV'li tutar: " + tutar + " tl");





    }
}
