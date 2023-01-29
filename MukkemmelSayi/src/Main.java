import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        boolean isPerfectNumber = false;
        System.out.print("Bir sayi giriniz:");
        number = input.nextInt();
        for (int i= 1; i < number ; i++)
        {
            if (number % i == 0)
            {
                total += i;
            }
        }
        if (total == number)
        {
            isPerfectNumber = true;
        }

        if (isPerfectNumber)
        {
            System.out.print(number+" mükkemmel sayidir");
        }
        else
        {
            System.out.print(number+" mükkemmel sayi değildir");

        }

    }
}