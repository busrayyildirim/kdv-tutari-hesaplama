import java.util.Scanner;

public class KdvTutariHesaplama {
    /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
    KDV tutarı hesaplayan programı yazınız. */
    public static void main(String[] args) {
        double para;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz:");
        para = input.nextDouble();

        double kdvOrani = (para >= 0 && para <= 1000) ? 0.18 : 0.8;
        double kdvTutari = para * kdvOrani;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV Oranı:" + kdvOrani);
        System.out.println("KDV Tutarı:" + kdvTutari);
        System.out.println("KDV'li Fiyat:" + kdvliFiyat);


    }

}
