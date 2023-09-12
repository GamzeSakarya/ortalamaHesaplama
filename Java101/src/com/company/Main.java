import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;

        String durum = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("ortalamanız :" + sonuc);
        System.out.println(durum);
    }
}
