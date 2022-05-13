package sogutucuCihaz;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VeriTabaniIslemleri {
    private static VeriTabaniIslemleri instance;
    private PrintWriter out;
    private String kullaniciAdi= null;
    private String kullaniciId=null;
    private String sifre = null;
    ArrayList<String> Kisiler = new ArrayList<String>();
    ArrayList<String> Sifreler = new ArrayList<String>();
    ArrayList<String> KisiNolari = new ArrayList<String>();


    private VeriTabaniIslemleri(){
        try{// veritabaniyla baglanti kurulumu
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kisiler", "postgres", "ibrahim");
            if(conn != null)
                System.out.println("Veritabanina baglanti gerceklesti.");
            else System.out.println("Veritabanina baglanilamadi.");

            String sorgu = "SELECT \"kullaniciNo\", \"kullaniciAdi\", \"sifre\"  FROM \"kullanicilar\"";
            //****sorgu calistirma*****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);
            //****baglanti sonlandirma*****/
            conn.close();

            String kullaniciNo = null;
            String kullaniciAdi = null;
            String sifre;

            while (rs.next()){
                kullaniciNo = rs.getString("kullaniciNo");
                kullaniciAdi = rs.getString("kullaniciAdi");
                sifre = rs.getString("sifre");

                Kisiler.add(kullaniciAdi);
                KisiNolari.add(kullaniciNo);
                Sifreler.add(sifre);
            }
            rs.close();
            stmt.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static synchronized VeriTabaniIslemleri getInstance(){
        if(instance==null) instance = new VeriTabaniIslemleri();
        return instance;
    }
    public ArrayList<String> KullaniciNoDondurme(){
        return KisiNolari;
    }
    public boolean KullaniciDogrulama(String kullaniciAdi, String sifre){
        System.out.println("Kullanici dogrulaniyor...");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }

        for(int i = 0; i < Kisiler.size(); i++){
            if(Kisiler.get(i).equals(kullaniciAdi) && Sifreler.get(i).equals(sifre)){
                System.out.println("Kullanici dogrulanmistir...\n");
                return true;
            }
        }
        System.out.println("Maalesef kullanici dogrulanamadi!!!");
        return false;
    }
}

