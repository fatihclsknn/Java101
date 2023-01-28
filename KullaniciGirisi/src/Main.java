import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        String sifremiUnuttum = "";

        System.out.println("Kullanici adiniz");
        userName = input.nextLine();
        System.out.println("Şifreniz");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("123java"))
        {
            System.out.println("Giriş başarili. yönlendiriliyorsunuz....");
        }
        else
        {
            System.out.println("Şifre yanlış şifrenizi sıfırlamak ister misiniz?  evet/hayır");
            sifremiUnuttum = input.nextLine();
        }


        if (sifremiUnuttum.equals("evet"))
        {
            String newPassword;
            System.out.println("Yeni şifre giriniz");
            newPassword = input.nextLine();
            if (password.equals(newPassword) )
            {
                System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz! Şifre oluşturalamadı \nLütfen başka şifre giriniz.");
            }
            else if (!password.equals(newPassword))
            {
                System.out.print("Yeni şifreniz Oluşturuldu.");

            }

        }
    }
}