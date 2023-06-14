import java.util.Scanner;

public class Main {
    static int DeseneGore(int n, int ntemp, boolean stop){
        System.out.print(n + " ");

        if (n<0 || n == 0 || !stop){
            stop = false;
            if (n != ntemp){
                return DeseneGore(n+5,ntemp,stop);
            }else return n;
        } else {
          return DeseneGore(n-5 , ntemp,stop);
        }
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter number: ");
        int n, ntemp;
        n = inp.nextInt();
        DeseneGore(n, ntemp=n, true);

    }
}