import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
// menü
        String menu = "1- Toplama\t" + "2- Çıkarma\t" + "3- Çarpma\t" + "4- Bölme\t" + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod alma\t" + "7- Dikdörtgen Alan, Çevre Hesaplama\t" + "\t0- Çıkış";

// işlem türünü ve n1 n2 değişkenlerini isteyen alan
        while (true) {
            System.out.println(menu);
            System.out.print("bir işlem türü seçiniz: ");
            int process = inp.nextInt();

// eğer işlem türü 0 ise program biter değilse sayıları isteyip switch case'lere gider
            if (process == 0)
                break;
            System.out.println("ilk sayıyı giriniz: ");
            int n1 = inp.nextInt();
            System.out.println("ikinci sayıyı giriniz: ");
            int n2 = inp.nextInt();

// kullanıcı işlem türünü seçtikten sonra program buradan metotlara gider
            switch (process) {
                    case 1:
                        sum(n1, n2);
                        break;
                    case 2:
                        extraction(n1, n2);
                        break;
                    case 3:
                        impact(n1, n2);
                        break;
                    case 4:
                        divide(n1, n2);
                        break;
                    case 5:
                        exponentialNumber(n1, n2);
                        break;
                    case 6:
                        mod(n1,n2);
                        break;
                    case 7:
                        alanCevre(n1,n2);
            }
        }
    }

// geriye kalan metot ve işlemler
    static void sum(int n1, int n2) {
        int result = n1+n2;
        System.out.println("sonuç: " + result);
    }
    static void extraction(int n1,int n2){
        int result = n1-n2;
        System.out.println("sonuç: " + result);
    }
    static void impact(int n1, int n2){
        int result = n1*n2;
        System.out.println("sonuç" + result);
    }
    static void divide(int n1, int n2){
        int result = n1/n2;
        System.out.println("sonuç: " + result);
    }
     static void exponentialNumber(int n1, int n2){
         System.out.print(n1 + " üssü " + n2 + " = ");
         System.out.println(Math.pow(n1,n2));
     }
     static void mod(int n1, int n2){
         System.out.println("sonuç: " + (n1%n2));
     }
     static void alanCevre(int n1, int n2){
         System.out.println("alan: " + (n1*n2) + "çevre: " + ((n1*2) + (n2*2)));
     }



}
