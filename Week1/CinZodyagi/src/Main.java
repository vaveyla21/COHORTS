import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int  birthDay;
        System.out.println("doğum tarihinizi giriniz: ");
        birthDay = inp.nextInt();
        switch (birthDay % 12){
            case 0:
                System.out.println("çin zodyağı burcun: " + "maymun" );
                break;
            case 1:
                System.out.println("çin zodyağı burcun: " + "horoz" );
                break;
            case 2:
                System.out.println("çin zodyağı burcun: " + "köpek" );
                break;
            case 3:
                System.out.println("çin zodyağı burcun: " + "domuz" );
                break;
            case 4:
                System.out.println("çin zodyağı burcun: " + "fare" );
                break;
            case 5:
                System.out.println("çin zodyağı burcun: " + "öküz" );
                break;
            case 6:
                System.out.println("çin zodyağı burcun: " + "kaplan" );
                break;
            case 7:
                System.out.println("çin zodyağı burcun: " + "tavşan" );
                break;
            case 8:
                System.out.println("çin zodyağı burcun: " + "ejderha" );
                break;
            case 9:
                System.out.println("çin zodyağı burcun: " + "yılan" );
                break;
            case 10:
                System.out.println("çin zodyağı burcun: " + "at" );
                break;
            case 11:
                System.out.println("çin zodyağı burcun: " + "koyun" );
                break;









        }

    }
}
