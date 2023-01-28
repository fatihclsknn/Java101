import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Doğduğunuz ay(1-12):");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün(1-31):");
        day = input.nextInt();

        if (month == 1)
        {
            if (day <= 22 && day >= 1)
            {
                System.out.print("Oğlak Burcu");
            }
            else
                System.out.print("Kova Burcu");
        }
        if (month == 2)
        {
            if (day <= 19  && day >= 1)
            {
                System.out.print("Kova Burcu");
            }
            else
                System.out.print("Balık Burcu");
        }
        if (month == 3)
        {
            if (day <= 20  && day >= 1)
            {
                System.out.print("Balık Burcu");
            }
            else
                System.out.print("Koç Burcu");
        }
        if (month == 4)
        {
            if (day <= 20  && day >= 1)
            {
                System.out.print("Koç Burcu");
            }
            else
                System.out.print("Boğa Burcu");
        }
        if (month == 5)
        {
            if (day <= 21  && day >= 1)
            {
                System.out.print("Boğa Burcu");
            }
            else
                System.out.print("İkizler Burcu");
        }
        if (month == 6)
        {
            if (day <= 22  && day >= 1)
            {
                System.out.print("İkizler Burcu");
            }
            else
                System.out.print("Yengeç Burcu");
        }
    }
}