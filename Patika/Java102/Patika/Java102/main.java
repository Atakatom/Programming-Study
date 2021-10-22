package Patika.Java102;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] a = new int[7];
        Random rand = new Random();
        while (true) {
            for (int i = 0; i < a.length; i++)
                a[i] = rand.nextInt(9);
            if (100 * a[0] + 10 * a[1] + a[2] + 100 * a[0] + 10 * a[3] + a[4] == 100 * a[5] + 10 * a[6] + a[5])
                break;
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        // MyList<Integer> liste = new MyList<>();
        // System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        // liste.add(10);
        // liste.add(20);
        // liste.add(30);
        // liste.add(40);
        // liste.add(20);
        // liste.add(50);
        // liste.add(60);
        // liste.add(70);

        // System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // // Bulduğu ilk indeksi verir
        // System.out.println("Indeks : " + liste.indexOf(20));

        // // Bulamazsa -1 döndürür
        // System.out.println("Indeks :" + liste.indexOf(100));

        // // Bulduğu son indeksi verir
        // System.out.println("Indeks : " + liste.lastIndexOf(20));

        // // Listeyi Object[] dizisi olarak geri verir.
        // Object[] dizi = liste.toArray();
        // System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // // Liste veri türünde alt bir liste oluşturdu
        // MyList<Integer> altListem = liste.subList(0, 3);
        // System.out.println(altListem.toString());

        // // Değerim listedeki olup olmadığını sorguladı
        // System.out.println("Listemde 20 değeri : " + liste.contains(20));
        // System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        // liste.clear();
        // System.out.println(liste.toString());

    }

}
