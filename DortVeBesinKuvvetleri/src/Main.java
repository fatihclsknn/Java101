import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        System.out.println("4'ün kuvvetleri");

        for (int i= 1; i <= number; i*=4)
        {
            System.out.print(i+",");
        }
        System.out.println("\n5'ün kuvvetleri");

        for (int i= 1; i <= number; i*=5)
        {
            System.out.print(i+",");
        }
    }
}