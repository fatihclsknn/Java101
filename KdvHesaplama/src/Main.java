import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  tutar;
        double  kdvOrani;
        double kdvliTutar = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz");
        tutar = input.nextDouble();

       if (tutar > 0 && tutar <= 1000)
       {
           kdvOrani = 0.18;
           kdvliTutar = tutar + (tutar * kdvOrani);

       }
       else if(tutar > 1000)
       {
           kdvOrani = 0.08;
           kdvliTutar = tutar + (tutar * kdvOrani);
       }
        System.out.println("Normal tutar:"+tutar+"\tKdvli tutar"+kdvliTutar);


    }
}