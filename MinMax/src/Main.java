import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int piece, max, min, number;
        System.out.println("Kaç tane sayi gireceksiniz");
        piece = input.nextInt();
        max = Integer.MIN_VALUE;
        min =  Integer.MAX_VALUE;
        for (int i= 1; i <= piece; i++)
        {
            System.out.print( i+".sayiyi giriniz:");
            number = input.nextInt();
            if (number > max)
            {
                max = number;
            }
            if (number < min)
            {
                min = number;
            }
        }
        System.out.println("En büyük sayi:"+max);
        System.out.println("En büyük sayi:"+min);

    }
}