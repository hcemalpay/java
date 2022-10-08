import java.util.Scanner;

/**
 * @author hcalpay
 * @Date 8.10.2022
 */

 /*
    *
    *  Klavyeden girilen boy ve kilo bilgilerine göre beden kitle indeksi hesaplayan program.
            BKİ= kilo/(boy^2)
     	    Zayıf 		                < 18,5
            Normal 	                 18,5 - 24,9
            Fazla Kilolu             25 - 29,9
            Obezite                  30 - 40
            Aşırı Kilolu                > 40
    *
    *
    * Klavyeden boy bilgisi alınacak
    * 100 cm altı ve 250 cm üstü bizim için hesaba katılması
    * boy degiskene atanacak
    * klavyeden kilo bilgisi alınacak
    * kilo 40 kg ve 150 kg üstü hesaba katma
    * kilo değişkene atanacak
    *
    * beden kitle indexi hesaplayan metod olsun
    *   boy ve kilo parametresi gönderilsin
    *   kilo / boy * boy
    *   bki degiskenine atasın
    *   koşullara baksın ekran uyarıları versin
    *
    * */
public class BedenKitleIndexi {

    void bedenKitleIndeksi(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz (cm) cinsinden :  ");
        int boy = scanner.nextInt();
        System.out.println("Lütfen Kilonuzu Giriniz (kg) cinsinden :  ");
        double kilo = scanner.nextInt();

        if (boy > 100 && boy < 250 && kilo >40 && kilo<150) {
            bedenKitleIndeksiHesapla(boy,kilo);
        } else {
            System.out.println(" girdiniz ölçüler standartlara uygun değil");
        }


    }

    public void bedenKitleIndeksiHesapla(int boy,double kilo){
        double boyMetre = boy/100;
        double bki = kilo / (boyMetre * boyMetre );
        String msg ;
        msg = "senin bki= "+ bki ;
        if(bki <18.5){
            System.out.println(msg  +" zayıfsın bro!!!");
        }else if ( 18.5<= bki && bki <=24.9){
            System.out.println(msg +"normalsin yigidim");
        }else if (25<= bki && bki <=29.9){
            System.out.println(msg +"biraz fazla mı yiyorsun");
        }else if (30<= bki && bki <=40){
            System.out.println(msg +"obezzzz");
        }else {
            System.out.println(msg + "acil spora başla");
        }
    }
}
