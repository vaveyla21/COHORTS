

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        double weight, indeks;
        int kilo;

        // kullanıcıdan değer alma kısmı
        System.out.print("kilonuzu giriniz: ");
        kilo = inp.nextInt();

        System.out.print("boyunuzu metre cinsinden giriniz (örnk:1,72) : ");
        weight = inp.nextDouble();

        // indeksi bulan işlem
        indeks = kilo / (weight*weight);
        System.out.println(indeks);


    }
}
