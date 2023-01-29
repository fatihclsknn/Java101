import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0)
        {
            System.out.print("Kullanici adiniz:");
            userName = input.nextLine();
            System.out.print("Şifreniz:");
            password  = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Merhaba, Patika Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                   switch (select)
                   {
                       case 1:
                           System.out.print("Hesap Bakiyeniz:"+balance);
                           System.out.print("Yatırmak istediğiniz tutar:");
                           int price = input.nextInt();
                           balance += price;
                           break;
                       case 2:
                           System.out.print("Hesap Bakiyeniz:"+balance);
                           System.out.print("Çekmek istediğiniz tutar:");
                           int withdrawn = input.nextInt();
                           if (withdrawn > balance)
                           {
                               System.out.print("Hesap bakiyenizden fazla para çekemezsiniz\n");
                           }
                           else
                           {
                               balance -= withdrawn;
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz : " + balance);
                            break;
                   }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else {
                right--;
                if (right == 0)
                {
                    System.out.print("Üç kere üst üste yanlış giriş yapıldığı için hesabınız bloke olmuştur.");
                }
                else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}