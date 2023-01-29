import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        double avarage;
        System.out.println("Bir sayi giriniz");
        number = input.nextInt();
        for (int i= 1; i <=number; i++)
        {
            if ( i % 3 == 0 && i % 4 == 0)
            {
                sum += i;
                count++;
                System.out.println(i);
            }
        }
        if (count > 1)
        {
            avarage = (double) sum / count;
            System.out.printf("0 ile %d arasında 3 ve 4'e tam bölüneblen sayıların ortalaması=%f",number,avarage);
        }
        else
            System.out.printf("0 ile %d arasında 3 ve 4'e tam bölüneblen sayı bulunamadı",number);

    }
}