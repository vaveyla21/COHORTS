import java.util.Scanner;
public class Main {

    // metot
    static void asal (int a){
        // ilk for kullanıcıdan aldığı sayıya kadar döner
        for (int i= 2; i<a ; i++){
            // factor'u asal sayıları yazırmak için oluşturduk. boolean true false ile de yapabilirdik
            int factor = 0;
            // ikininci for kullanıcıdan aldığı sayıya kadar olan sayıların tam bölünüp bölünmediğini kontrol ediyor. bu şekilde asallar bulunuyor
            for (int i2 = 2; i2<i; i2++){
                if (i%i2==0) factor++;

            }
            if (factor==0) System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("hangi sayıya kadar asallar bulunsun: ");
        asal(inp.nextInt());
    }
}
