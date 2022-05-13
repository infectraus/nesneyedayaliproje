package sogutucuCihaz;

import java.util.Scanner;

public class SogutucuUygulamasi {
    public SogutucuUygulamasi(){
        String kullaniciAdi;
        String sifre;
        boolean girisKontrol = false;
        do{//Kullanici bilgileri dogrulanana dek ekrandan kullanici bilgileri istenir
            Scanner getInfo = new Scanner(System.in);
            System.out.println("Lutfen Kullanici Adinizi Giriniz: ");
            kullaniciAdi = getInfo.next();
            System.out.println("Lutfen Sifrenizi Giriniz: ");
            sifre = getInfo.next();
            //kullanici dogrulamasi icin kosul kontrolu
            if(VeriTabaniIslemleri.getInstance().KullaniciDogrulama(kullaniciAdi, sifre)){
                AgArayuzu arayuzbirim = new AgArayuzu();
                girisKontrol = true;
            }

        }while(!girisKontrol);
    }
}
