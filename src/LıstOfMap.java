import java.util.ArrayList;
import java.util.HashMap;
public class LıstOfMap {
    public static void main(String[] args) {

        HashMap<String, String> ilkOgrenci = new HashMap<>();

        ilkOgrenci.put("isim","Burak");
        ilkOgrenci.put("soyisim","kesin");
        ilkOgrenci.put("ders","matematik");
        ilkOgrenci.put("Not","90");
        System.out.println(ilkOgrenci);

        HashMap<String, String> ikinciOgrenci = new HashMap<>();

        ikinciOgrenci.put("isim",  "Selam");
        ikinciOgrenci.put("soyisim", "kalem");
        ikinciOgrenci.put("ders","matematik");
        ikinciOgrenci.put("not ","50");


        HashMap<String, String> ücüncüOgrenci = new HashMap<>();

        ücüncüOgrenci.put("isim",  "Zülal");
        ücüncüOgrenci.put("soyisim", "gonca");
        ücüncüOgrenci.put("ders","matematik");
        ücüncüOgrenci.put("not ","80");

        System.out.println(ilkOgrenci);
        System.out.println(ikinciOgrenci);
        System.out.println(ücüncüOgrenci);

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList<>();

        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ücüncüOgrenci);
        ogrenciListesi.add(ikinciOgrenci);

        System.out.println(ogrenciListesi);
        System.out.println(ogrenciListesi.get(0));




    }

}
