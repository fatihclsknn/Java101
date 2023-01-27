import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        int armutKilo = input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        int elmaKilo = input.nextInt();
        System.out.println("domates Kaç Kilo ? :");
        int domatesKilo = input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        int muzKilo = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        int patlicanKilo = input.nextInt();
        double toplam = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlicanKilo * patlican);
        System.out.println("Toplam Tutar:"+ toplam);
    }
}