import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int total=0;
        int number=0;

        do {
            System.out.print ("Bir sayı giriniz: ");
            number= scan.nextInt ();

            if (number %2==0 || number %4==0){
                total += number;
            }
        } while (number %2 !=1);

        System.out.print ("Girilen çift ve 4'ün katları olan sayıların toplamı: " + total);

    }
}