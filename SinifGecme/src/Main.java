import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dersler = new String[5];
        int     toplam;
        double  ortlama;

        toplam  = 0;
       for (int i= 0; i < dersler.length; i++)
       {
           System.out.print("Ders adi girizini: ");
           dersler[i] = input.nextLine();
       }
       int[] notlar = new int[dersler.length];
        for (int i= 0; i < dersler.length; i++)
        {
            System.out.print( dersler[i]+" notunu giriz:");
            notlar[i] = input.nextInt();
        }

        for (int not : notlar)
        {
            if (not >= 0 && not <= 100)
            {
                toplam += not;
            }
        }
        ortlama = toplam / (double)notlar.length;
        if (ortlama > 55)
        {
            System.out.println("Tebrikler Sınıfı geçtiniz. Ortlaamanız:"+ortlama);
        }
        else
        {
            System.out.println("Sınıfı geçemediniz. Ortalamanız:"+ortlama);

        }
    }
}