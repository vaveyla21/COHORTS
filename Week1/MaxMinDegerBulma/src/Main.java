import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        int number, unit, max = 0, min = 0;

        // girilecek sayı adeti
        System.out.print("kaç adet sayı girilecek: ");
        unit = inp.nextInt();

    /*
     for döngüsü içerisinde her seferinde sayıların verisi alınıp
     bu sayıların if bloklarıyla küçük ve büyüklüğünün kıyaslandığı yer.
     ----------------------------------------------------------------------
        *girilen sayılardan küçüğünü min
        *girilen sayılardan büyüğünü max'a atayıp for döngüsü bittikten sonra
        *kullanıcıya çıktı veriyor
     */
        for (int i = 1; i <= unit; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = inp.nextInt();
            if (min > number || min == 0){
                min = number;
            }
            if (max < number){
                max = number;
            }
        }
        System.out.println("girilen sayılar arasında en küçüğü: " + min);
        System.out.println("girilen sayılar arasında en büyüğü: " + max);
    }
}
