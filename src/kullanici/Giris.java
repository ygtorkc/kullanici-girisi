package kullanici;

import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.println("Kullanıcı adı giriniz:");
        username = input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        password = input.nextLine();
        if (username.equals("yigit") && password.equals("yigit123")) {
            System.out.println("Giriş yaptınız!!");
        }
else {
    System.out.println("Bilgileriniz yanlış!!");
        }
    }

}
