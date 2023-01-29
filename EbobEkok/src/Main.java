import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2;
        int ebob = 1;
        int ekok;
        System.out.print("Birinci sayiyi giriniz:");
        number1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        number2 = input.nextInt();
        int k = Math.min(number1,number2);
        while (k >= 1)
        {
            if (number1 % k == 0 && number2 %k == 0)
            {
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println(number1 +" ve " +number2 +" sayılarının ebobu:"+ebob);
        ekok = (number1 * number2) / ebob;
        System.out.print(number1 +" ve " +number2 +" sayılarının ekoku:"+ekok);

    }
}