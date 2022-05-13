package sogutucuCihaz;

public class Kullanici1 implements IObserver{
    @Override
    public void update(String mesaj){

        System.out.println("1 No'lu Kullanicimiz " + mesaj);

    }
}
