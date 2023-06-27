import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("dizinin boyutunu giriniz: ");
        int dimenson = inp.nextInt();

        int[] arr = new int[dimenson];

        System.out.println("dizinin elemanlarını giriniz ");
        for (int i = 0; i<dimenson; i++){
            System.out.print((i+1) + ". eleman: ");
            arr[i] = inp.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Dizinin sıralanmış hali: ");
        for (int a = 0; a<dimenson; a++){
            System.out.print(arr[a] + ", ");
        }


        }
    }
