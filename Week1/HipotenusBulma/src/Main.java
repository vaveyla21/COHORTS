import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // değişkenler
        int komsukenar, karsikenar ;
        double hipotenus;

        // kullanıcıdan kenar verilerinin alındığı kısım
        System.out.println("komşu dik kenarı giriniz: ");
        komsukenar = inp.nextInt();
        System.out.println("karşı dik kenarı giriniz: ");
        karsikenar = inp.nextInt();

        // hipotenüsü bulan işlem

        hipotenus = Math.sqrt((komsukenar*komsukenar) + (karsikenar*karsikenar)) ;
        System.out.println(hipotenus);

    }
}
