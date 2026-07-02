import java.util.Scanner;

public class Bankomat {

  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        double balans = 648.90;

        Scanner scan = new Scanner(System.in);
        String[] dogruSifre = {"1234", "963852", "dada321", "12345678"};
        System.out.println("Şəxsi PW şifrənizi daxil edin:");
        String sifre = scan.nextLine();
        boolean isValid = false;

        //Şifrə kontrol edilir
       for (String ds : dogruSifre) {
            if (sifre.equals(ds)) {
                isValid = true;
                break;
            }
        }

        if (isValid == true) {
            while ( true ) {
                System.out.println("/nMenyu:");
                System.out.println("1-) Pul daxil et");
                System.out.println("2-) Balans göstər");
                System.out.println("3-) Pul çıxart");
                System.out.println("4-) Çıxış et.");
int secim = scan.nextInt();

switch (secim) {
    case 1:
        System.out.println("Pul daxil etmək üçün əskinasları bankomatın müvafiq yerinə daxil edin.");
        int pulDaxil = scan.nextInt();
        balans+= pulDaxil;
        System.out.println("Əməliyyatınız icra olunmuşdur!");
        System.out.println("Balans:" +balans +"AZN");
        break;
    case 2:
        System.out.println("Balans:" +balans +"AZN");
        break;
        case 3:
            System.out.println("Çıxarılacaq məbləği daxil edin:");
            int pulChixart = scanner.nextInt();
            if (pulChixart <= balans) {
                balans-=pulChixart;
                System.out.println("Əməliyyatınız icra olunmuşdur!");
                System.out.println("Balans:" +balans +"AZN");
            } else {
                System.out.println("Balansda kifayət qədər vəsait yoxdur." +"Balansınız:" +balans +"AZN");
            }
            break;
    case 4:
        System.out.println("Çıxış edilir");
        return; // Döngüyü sonlandırmak için
                    default:
                        System.out.println("Yanlış seçim. Yenidən cəhd edin.");
        }
            }
        } else {
            System.out.println("Yanlış şifre. Yenidən cəhd edin.");


        }

    }
}

