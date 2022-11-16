import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar;
        double kdvOran = 18;
        double kdvOran2 = 8;
        int kdvTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün Tutarını Giriniz: ");
        tutar = input.nextDouble();


        double kdvliTutar = tutar > 0 & tutar < 1000 ? (tutar * kdvOran ) / 100  : (tutar * kdvOran2 ) / 100;

        System.out.println("Ürünün KDV'li Tutarı: " + (tutar + kdvliTutar));

    }
}