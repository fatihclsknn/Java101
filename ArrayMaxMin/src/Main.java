import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int number, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Arrays.sort(list);
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:"  );
        number = input.nextInt();
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < number)
            {
                min = list[i];
            }
            if (list[i] > number)
            {
                max = list[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+min  );
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+max  );


    }
}