package sogutucuCihaz;



public class AnaIslemBirimi {
    private boolean acikMi = false;
    public AnaIslemBirimi(){
        Eyleyici eyleyici = new Eyleyici();
    }

    public void EyleyiciCalistirma(String durum){
        Eyleyici eyleyici = new Eyleyici();

        System.out.println("Eyleyiciye istek gonderiliyor...");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }

        if(durum.equals("Ac")){ //Soğutucu zaten açık mı oldugunu kontrol eder
            eyleyici.SogutucuAc();
            acikMi = true;
        }
        else { //Soğutucu zaten açık değil durumunu gosterir
            eyleyici.SogutucuKapat();
            acikMi = false;
        }
    }

    public boolean SogutucuAcikMidir(){
        if(acikMi){
            return true;
        }else return false;
    }
    public boolean SogutucuKapaliMidir(){
        if(acikMi){
            return false;
        }else return true;
    }
}
