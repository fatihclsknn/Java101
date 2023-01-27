import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik, matematik, kimya, turkce, tarih, muzik, toplam;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz:");
        matematik = input.nextInt();

        System.out.println("fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.println("kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("türkce notunu giriniz:");
        turkce = input.nextInt();

        System.out.println("tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.println("muzik notunu giriniz:");
        muzik = input.nextInt();

        toplam = (matematik + kimya + fizik + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        boolean gecti = ortalama >= 60;
        boolean sonuc = gecti;
        String mesaj  = sonuc ? "Geçti" : "Kaldi";
        System.out.println(mesaj);

    }
}