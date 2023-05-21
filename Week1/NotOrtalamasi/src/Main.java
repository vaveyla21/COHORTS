import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double physical, maths, chemical, music, turkish;

        //değerleri aldığımız kısım

        System.out.println("fizik notunu giriniz: ");
        physical = inp.nextDouble();

        System.out.println("matematik notunu giriniz: ");
        maths = inp.nextDouble();

        System.out.println("kimya notunu giriniz: ");
        chemical = inp.nextDouble();

        System.out.println("müzik notunu giriniz: ");
        music = inp.nextDouble();

        System.out.println("türkçe notunu giriniz: ");
        turkish = inp.nextDouble();

        // ortalamayı hesaplayan kısım
        double ort = (physical+maths+chemical+music+turkish)/5;

        // ortalama 50 altı ise kaldınız üstü ise geçtiniz sorgusunun olduğu kısım

        if (ort>=50){
            System.out.println("TEBRİKLER GEÇTİNİZ!" + "\n oralamanız: " + ort);
        } else if (ort<50) {
            System.out.println("KALDINIZ!" + "\n ortalamanız: " + ort);
        }


    }
}
