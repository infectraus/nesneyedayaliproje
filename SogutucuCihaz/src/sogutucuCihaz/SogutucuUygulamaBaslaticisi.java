package sogutucuCihaz;

public class SogutucuUygulamaBaslaticisi {
    public static void main(String[] args) {
        Kullanici1 k1 = new Kullanici1();
        Kullanici2 k2 = new Kullanici2();

        Yayinlayici publisher = new Yayinlayici();

        publisher.attach(k1);
        publisher.attach(k2);


        SogutucuUygulamasi basla = new SogutucuUygulamasi();
    }
}
