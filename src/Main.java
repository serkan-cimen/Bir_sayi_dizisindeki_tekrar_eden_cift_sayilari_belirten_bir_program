import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 7, 8, 10, 4, 8, 6, 10, 12};
        bulTekrarEdenCiftSayilar(dizi);
    }

    public static void bulTekrarEdenCiftSayilar(int[] dizi) {
        HashMap<Integer, Integer> sayac = new HashMap<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                sayac.put(sayi, sayac.getOrDefault(sayi, 0) + 1);
            }
        }

        System.out.println("Tekrar eden çift sayılar : ");
        for (int sayi : sayac.keySet()) {
            int tekrarSayisi = sayac.get(sayi);
            if (tekrarSayisi > 1) {
                System.out.println(sayi + " (tekrar : " + tekrarSayisi + " kez)");
            }
        }
    }
}