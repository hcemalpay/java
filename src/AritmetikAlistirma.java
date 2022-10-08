import javax.swing.*;
import java.util.Random;

/**
 * @author hcalpay
 * @Date 8.10.2022
 */
public class AritmetikAlistirma {

    /*
     * kullanıcıdan 4 tane secenekteden birisini seçmesini istiyoruz.
     * kullanıcdan 2 değer alıyoruz
     *
     * eğer 1 secerse  bu değerleri topluyoruz.
     *
     * eğer 2 secerse  cıkarıyoruz
     *
     * eğer 3 secerse çarpıyoruz
     *
     * eğer 4 secerse  bölüyoruz
     *
     * */

    void hesaplamaIslemleri() {

        JOptionPane.showMessageDialog(null, "Bu Program hesaplama işlemleri yapmak içindir.\n" +
                "1 = iki sayının toplamını yapmak içindir\n" +
                "2 = iki sayının farkını bulmak içindir\n" +
                "3 = iki sayının çarpımını bulmak içindir\n" +
                "4 = iki sayının bölümünü bulmak içindir\n" +
                "5 = iki sayının maximumunu bulmak içindir\n" +
                "6 = iki sayının üslü sonucu bulmak içindir");

        int secenek = Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir secenek Giriniz"));
        if (secenek < 1 || secenek > 6) {
            JOptionPane.showMessageDialog(null, "Secenekler birisini seciniz.");
        } else {
            int sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen birinci sayiyi Giriniz:"));
            int sayi2 = Integer.parseInt(JOptionPane.showInputDialog("Lütfen ikinci sayiyi Giriniz:"));

            switch (secenek) {
                case 1 -> {
                    int toplam = sayi1 + sayi2;
                    JOptionPane.showMessageDialog(null, "İki Sayının Toplamı =" + toplam);
                }
                case 2 -> {
                    int fark = sayi1 - sayi2;
                    JOptionPane.showMessageDialog(null, "İki Sayının Farkı =" + fark);
                }
                case 3 -> {
                    int carpim = sayi1 * sayi2;
                    JOptionPane.showMessageDialog(null, "İki Sayının çarpımını =" + carpim);
                }
                case 4 -> {
                    double bolum = (double) sayi1 / sayi2;
                    JOptionPane.showMessageDialog(null, "İki Sayının bölümünü =" + bolum);
                }
                case 5 -> {
                    int max = Math.max(sayi1,sayi2);
                    JOptionPane.showMessageDialog(null, "İki Sayının maximumu =" + max);
                }
                case 6 -> {
                    double sonuc = Math.pow(sayi1,sayi2);
                    JOptionPane.showMessageDialog(null, "İki Sayının üslüsü =" + sonuc);

                }
            }
        }
    }
}
