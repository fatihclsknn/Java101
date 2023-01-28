import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("Birinci sayi:");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayi:");
        sayi2 = input.nextInt();
        System.out.print("İkinci sayi:");
        sayi3 = input.nextInt();
        System.out.printf("Girdiğiniz sayilar:%d,%d,%d",sayi1,sayi2,sayi3);
        System.out.printf(" Sayılar küçükten büyüğe sıralanıyor\n");
        
        if ((sayi1 < sayi2) && (sayi1 < sayi3))
        {
            if(sayi2 < sayi3)
            {
                System.out.printf("%d<%d<%d",sayi1,sayi2,sayi3);
            }
            else {
                System.out.printf("%d<%d<%d",sayi1,sayi3,sayi2);

            }
        } else if ((sayi2 < sayi1)&& (sayi2 < sayi3)) {
            if (sayi1 < sayi3)
            {
                System.out.printf("%d<%d<%d",sayi2,sayi1,sayi3);
            }
            else {
                System.out.printf("%d<%d<%d",sayi2,sayi3,sayi1);

            }

        }else {
            if (sayi1 < sayi2)
            {
                System.out.printf("%d<%d<%d",sayi3,sayi1,sayi2);
            }
            else {
                System.out.printf("%d<%d<%d",sayi3,sayi2,sayi1);

            }
        }

    }
}