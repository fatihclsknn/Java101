import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, basamak = 0;
        System.out.print("Bir sayi giriniz:");
        number = input.nextInt();

        while (number > 0)
        {
            basamak += number % 10;
            number = number /10;
        }
        System.out.print("sayısının basamklari toplamı="+basamak);

    }
}