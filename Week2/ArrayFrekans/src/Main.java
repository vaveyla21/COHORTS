public class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,3,2,4,1,0,5,0,4,5,5};
        for (int x = 0; x< arr.length;x++){
            int sayac = 0;
            for (int y = 0;y< arr.length;y++){
               if (arr[x]==arr[y]){
                sayac++;
               }
            }
            System.out.println(arr[x] + " sayısı " + sayac + " adet var");
        }
    }
}