import java.util.Scanner;

/**
 * @author hcalpay
 * @Date 8.10.2022
 */

/*
    Kullanıcıdan tam sayı değer isteniz 1-7 arasında
    eger deger aralık dısındaysa uyarı versin
    aralık içindeyse switch case bloguyla 1 den 7 kadar günlerin adını ekrana göstersin
* */
public class SwitchCase {

    void günleriyazdır() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Günü hesaplamam için bana bir sayı söyleyin (1-7) arasında ");
        int gunSayisi = scanner.nextInt();

        switch (gunSayisi) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Gün sayısı yanlış girildi.");
        }

    }


}
