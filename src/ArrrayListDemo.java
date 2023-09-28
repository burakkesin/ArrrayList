import java.util.ArrayList;
public class ArrrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> isimlerListesi = new ArrayList<>();

        isimlerListesi.add("ozan");
        isimlerListesi.add("burak");
        System.out.println(isimlerListesi);
        isimlerListesi.add("banu");
        isimlerListesi.add("suzan");
        System.out.println(isimlerListesi);
        System.out.println((isimlerListesi.get(0)));
        isimlerListesi.set(1, "hazal");
        System.out.println(isimlerListesi);
        String silinenIsım = isimlerListesi.remove(0);
        System.out.println(silinenIsım +"Listemizden çıkarılmıştır");
        System.out.println(isimlerListesi.size() + "Listemizin boytu");
        System.out.println(isimlerListesi.contains("ozan"));
        System.out.println("ısım liste numarası" +isimlerListesi.indexOf("banu"));
        System.out.println(isimlerListesi.isEmpty());

        for (String isim : isimlerListesi){
            System.out.println(isim);
        }




    }


}

