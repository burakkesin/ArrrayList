import java.util.HashMap;
 class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> ogrenciNotu = new HashMap<>();

        ogrenciNotu.put("Ozan",100);
        ogrenciNotu.put("Tibet",50);
        ogrenciNotu.put("Onur",90);

        System.out.println(ogrenciNotu);
        System.out.println("ozanın ders notu" + ogrenciNotu.get("Ozan"));
        System.out.println("Bütün anahtar değerleri" + ogrenciNotu.values());
        System.out.println("butun girdi çiftleri" + ogrenciNotu.entrySet());
        ogrenciNotu.replace("Ozan",30);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Ozan");
        System.out.println(ogrenciNotu);

    }
}
