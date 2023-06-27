public class Main {
    public static void main(String[] args) {
        // öncelikle transpozunu alacağımız array'ı tanımlıyoruz
        int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9}};
        // sonra transpoz olucak array oluşturuyoruz
        int[][] transp= new int[3][3];
        System.out.println("Transpozu:");

        // asıl kısım burası. çok boyutlu array olduğu için 2 for döngüsü kullanıyoruz (biri satır öteki sütunü ifade ediyor).
        // tanımladığımız "arr" adlı array'in satırını "transp" adlı array'ımızın sütununa eşitleyip yazdırıyoruz.
        for (int a =0 ; a< transp.length;a++){
            for (int b = 0; b < transp[a].length;b++) {
                transp[a][b] = arr[b][a];
                System.out.print(transp[a][b] + " ");
            }
            System.out.println(" ");
        }


    }
}