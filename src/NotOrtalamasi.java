import java.util.Random;
import java.util.Scanner;

/**
 * @author hcalpay
 * @Date 8.10.2022
 */

/*
*
* •	Java’da Not Ortalaması Hesaplan Program
•	Quiz, vize ve Final notları için Integer , Ortalama için Double veri türünde değişkenler oluştur.
•	Kullanıcıdan verileri almak için Scanner sınıfını projemize dahil et.
•	nextInt() metodu ile kulanıcıdan notlarını girmesini iste.
•	Girilen notların 1-100 aralığında olduğunu kontrol et.
•	Aritmetik operatörler ile ortalama hesapla
•	Quizin %20’i, vizenin %35’i, Finalin %45’i
•	Hesaplanın ortalamaya göre, koşul operatörünü kullanarak sınıfı geçip geçmediğini belirle
•	80 üstü geçer 50-80 arası koşullu geçer, 50 altı kalır.
•	Sonucu ekrana bastır.

* */

public class NotOrtalamasi {

    void notlar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("quiz notunu giriniz:");
        int quiz = scanner.nextInt();
        if(quiz>100 && quiz<1 ){
            System.out.println("100 lük sistemde not giriniz");
        }

        System.out.println("vize notunu giriniz:");
        int vize = scanner.nextInt();
        if(vize>100 && vize<1 ){
            System.out.println("100 lük sistemde not giriniz");
        }

        System.out.println("final notunu giriniz:");
        int finalNot = scanner.nextInt();

        if(finalNot>100 && finalNot<1 ){
            System.out.println("100 lük sistemde not giriniz");
        }
        if(finalNot<50){
            System.out.println("Tebrikler final başarınızla kaldınız");
        }else {
            hesapla(quiz,vize,finalNot);
        }

    }

    void hesapla(int quizNotu,int vizeNotu,int finalNotu){

        Random random = new Random();
        double kanaat = random.nextDouble(1,5);
        double ortalama = (quizNotu*0.2) + (vizeNotu * 0.35) + (finalNotu * 0.45)+kanaat;

        if(ortalama<= 100 && ortalama >=80){
            System.out.println("Sınıfı Başarıyla Geçtiniz. Ortalamanız :"+ortalama);
            System.out.println("Maximum aldıgınız not:"+Math.max(Math.max(quizNotu,vizeNotu),finalNotu));
        } else if (ortalama <80 && ortalama >=50){
            System.out.println("Sınıfı Koşullu Geçtiniz. Ortalamanız :"+ortalama);
            System.out.println("Maximum aldıgınız not:"+Math.max(Math.max(quizNotu,vizeNotu),finalNotu));
        }
        else {
            System.out.println("Sınıfı Başarıyla geçemedin. Ortalamanız :"+ortalama);
            System.out.println("Minimum aldıgınız not:"+Math.min(Math.max(quizNotu,vizeNotu),finalNotu));
        }

    }


}
