import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        int piece = scanner.nextInt();

        // dizimizin boyutu başta sorulan adet sayısına eşitliyoruz
        int[] numbers = new int[piece];

        // burada dizi boyutu kadar kullanıcıdan sayı alıyoruz
        for (int i = 0; i < piece; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        // asıl kıyamet burada kopuyor. kullanıcı büyük sayıyı önce yazmışsa burada yer değiştiriliyor
        // yani [3,1,2] ==> [1,3,2] ==> [1,2,3]
        for (int i = 0; i < piece - 1; i++) {
            for (int j = i + 1; j < piece; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // burası değerlerin yazdırıldığı alan. numbers array'in değerleri tek tek "sayi" değişkenine atanıyor
        // ve "sayi" değişkeni yazıdrılıyor
        System.out.println("Sıralama: ");
        for (int sayi : numbers) {
            System.out.print(sayi + " ");
        }
    }
}
