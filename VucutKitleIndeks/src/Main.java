import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double  boy;
        double  kilo;
        double  vucutKitleIndeksi;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz(1,72):");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz(55,2):");
        kilo = input.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeksi);
    }
}