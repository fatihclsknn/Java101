import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birinciKenar, ikinciKenar, ucuncuKenar;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin Birinci Kenarını Giriniz:");
        birinciKenar = input.nextInt();

        System.out.print("Üçgenin İkinci Kenarını Giriniz:");
        ikinciKenar = input.nextInt();

        System.out.print("Üçgenin üçüncü Kenarını Giriniz:");
        ucuncuKenar = input.nextInt();

        int cevre = birinciKenar + ikinciKenar + ucuncuKenar;
        double u = cevre / 2.0;
        double alan =  u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar);
        System.out.println("Girilen kenar bilgileirne göre üçgenin alanı:"+Math.sqrt(alan));
    }
}