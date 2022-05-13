package sogutucuCihaz;

import java.io.*;
import java.util.Scanner;

public class AgArayuzu {
    public AgArayuzu() {
        Ekran ekran = new Ekran();
        int secim = 1;
        AnaIslemBirimi anaIslemBirimi = new AnaIslemBirimi();
        do {
            Scanner secimAl = new Scanner(System.in);
            System.out.println("[1]--> Sogutucuyu ac");
            System.out.println("[2]--> Sogutucuyu kapat");
            System.out.println("[3]--> Sıcaklik goruntule");
            System.out.println("[4]--> Cikis yap");
            System.out.print("Lutfen Seciminizi Giriniz:");
            secim = secimAl.nextInt();

            switch (secim) {
                case 1:
                    if(anaIslemBirimi.SogutucuAcikMidir()){
                        ekran.mesajGoruntuleme("Sogutucu zaten acık durumda...");
                    }else anaIslemBirimi.EyleyiciCalistirma("Ac");
                    break;
                case 2:
                    if(anaIslemBirimi.SogutucuKapaliMidir()){
                        ekran.mesajGoruntuleme("Sogutucu zaten kapalı durumda...");
                    }else anaIslemBirimi.EyleyiciCalistirma("Kapansin");
                    break;
                case 3:
                    SicaklikAlgilayiciBirim sicaklik = new SicaklikAlgilayiciBirim();
                    ekran.mesajGoruntuleme("Sicaklik degeri algilaniyor...");
                    try {
                        // gecikme icin thread.sleep kullandik
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ekran.mesajGoruntuleme("Sicaklik Degeri: ");
                    System.out.print(sicaklik.SicaklikDegeriDondur());
                    ekran.mesajGoruntuleme("°C\n");
                    break;
                case 4:
                    try {
                        // gecikme icin thread.sleep kullandik
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ekran.mesajGoruntuleme("Sistemden basariyla cikis yapilmistir.");
                    break;
                default:
                    ekran.mesajGoruntuleme("Yanlis tercih sectiniz. Lutfen tekrar deneyiniz...");
                    break;
            }
        }while (secim != 4);


    }
}
