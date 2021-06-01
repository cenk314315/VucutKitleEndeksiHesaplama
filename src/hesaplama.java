import java.util.Scanner;

public class hesaplama {



    public static void main(String[] args) {

        double boy, kilo, endeks;
        Scanner deger = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = deger.nextDouble();


        System.out.print("Kilonuzu (kg) giriniz: ");
        kilo = deger.nextInt();

        endeks = kilo / boy / boy;
        System.out.print("Vücut kitle indeksiniz: " + endeks);



    }




}
