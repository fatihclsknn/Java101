import java.util.Scanner;

public class Main {
    static  boolean isPalindrom(int number)
    {
        int temp = number;
        int lastNumber;
        int reverseNumber = 0;
        while (temp != 0)
        {
            lastNumber = temp % 10;
            temp = temp / 10;
            reverseNumber = (reverseNumber * 10) +lastNumber;
        }
        return reverseNumber == number;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int number = input.nextInt();

        if (isPalindrom(number))
        {
            System.out.print(number+" palindrom sayıdır");
        }
        else
            System.out.print(number+" palindrom sayi değil");

    }
}