import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        // kullanıcının yılı girdiği kısım
        System.out.println("yıl giriniz: ");
        year = inp.nextInt();
        // eğer 4 e tam bölünüyorsa artık yıl bölünmüyorsa artık yıl değil
        if (year % 4 ==0){
            //eğer 100 e tam bölünmüyorsa artık yıldır 400 e bölünmüyorsa artık yıl değildir şayet 400 e bölünürse artık yıldır
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " artık yıldır");
                } else System.out.println("artık yıl değildir");
            }
            else System.out.println(year + "artık yıldır");
        }else System.out.println("artık yıl değildir");



    }
}
