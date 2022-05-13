package sogutucuCihaz;
import java.util.Random;

public class SicaklikAlgilayiciBirim implements ISicaklikAlgilayiciBirim {
    private int sicaklikDegeri;
    public SicaklikAlgilayiciBirim(){
        Random random = new Random();
        sicaklikDegeri = random.nextInt(40);
    }
    public int SicaklikDegeriDondur(){
        return sicaklikDegeri;
    }
}
