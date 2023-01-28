import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double normalTutar, mesafeBasiUcret, indirimliTutar, gidisDonusİndirimi, toplam;
        mesafeBasiUcret = 0.10;
        gidisDonusİndirimi = 0;
        toplam = 0;
        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1=>Tek Yön, 2=>Gidiş-Dönüş):");
        yolculukTipi = input.nextInt();
        normalTutar = mesafe * mesafeBasiUcret;
        if ((mesafe > 0 && yas > 0 ) && (yolculukTipi == 1 || yolculukTipi == 2))
        {
            System.out.println("Normal Tutar="+normalTutar);

            if (yas < 12)
                {
                    indirimliTutar = normalTutar - (normalTutar * 0.50);
                    System.out.println("Yaş  indirimi="+indirimliTutar);
                    System.out.println("İndirimli Tutar="+(normalTutar - indirimliTutar));
                    if (yolculukTipi == 2)
                    {
                        gidisDonusİndirimi = indirimliTutar * 0.20;
                        System.out.println("Gidiş dönüş bilet indirimi="+gidisDonusİndirimi);
                        toplam =  (indirimliTutar -gidisDonusİndirimi) *2;
                    }
                    else
                        toplam =  (indirimliTutar -gidisDonusİndirimi);
                }
            if (yas >= 12 && yas <= 24)
            {
                indirimliTutar = normalTutar - (normalTutar * 0.10);
                System.out.println("Yaş  indirimi="+indirimliTutar);
                System.out.println("İndirimli Tutar="+(normalTutar - indirimliTutar));
                if (yolculukTipi == 2)
                {
                    gidisDonusİndirimi = indirimliTutar * 0.20;
                    System.out.println("Gidiş dönüş bilet indirimi="+gidisDonusİndirimi);
                    toplam =  (indirimliTutar -gidisDonusİndirimi) *2;
                }
                else
                    toplam =  (indirimliTutar -gidisDonusİndirimi);
            }
            if (yas >= 65)
            {
                indirimliTutar = normalTutar - (normalTutar * 0.30);
                System.out.println("Yaş  indirimi="+indirimliTutar);
                System.out.println("İndirimli Tutar="+(normalTutar - indirimliTutar));
                if (yolculukTipi == 2)
                {
                    gidisDonusİndirimi = indirimliTutar * 0.20;
                    System.out.println("Gidiş dönüş bilet indirimi="+gidisDonusİndirimi);
                    toplam =  (indirimliTutar -gidisDonusİndirimi) *2;
                }
                else
                    toplam =  (indirimliTutar -gidisDonusİndirimi);
            }
            System.out.println("Toplam tutar:"+ normalTutar);
        }
        else {
            System.out.println("Hatalı giriş yaptınız:");

        }

    }
}