import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int us, taban;
        int sonuc = 1;
        System.out.print("Taban giriniz:");
        taban = input.nextInt();
        System.out.print("Üs giriniz:");
        us = input.nextInt();

        for (int i= 0; i < us; i++)
        {
            sonuc = sonuc * taban;
        }
        System.out.print(taban+" üssü "+us+"="+sonuc);
    }
}