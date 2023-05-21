import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // değişkenler
        int a=0, n1=1,n2;
        // week1.fibonacci serisinin eleman sayısını kullanıcıdan istedim
        System.out.print("week1.fibonacci serisi eleman sayısını giriniz: ");
        int count = inp.nextInt();

        //1 seferliğine mahsus ilk 2 basamağı yazdırıyoruz
        System.out.print(a +" " +n1);

        // for döngüsü içerisinde sayıların birbirine atama ve toplama işlemlerini yapıyoruz.
        for (int i = 2 ; i < count; i++) {
            n2=a+n1;

            System.out.print(" "+ n2 );
            a = n1;
            n1 = n2;


        }
    }
}
