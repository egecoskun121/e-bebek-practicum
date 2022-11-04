package egecoskun.Manav_Kasa_Programı;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double
                armutKilosu = 2.14,
                elmaKilosu =3.67,
                domatesKilosu = 1.11 ,
                muzKilosu = 0.95,
                patlıcanKilosu = 5.00,
                armutMiktari, elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? ");
        armutMiktari= input.nextDouble();

        System.out.println("Elma Kaç Kilo ?   ");
        elmaMiktari= input.nextDouble();

        System.out.println("Domates Kaç Kilo ?   ");
        domatesMiktari= input.nextDouble();

        System.out.println("Muz Kaç Kilo ?   ");
        muzMiktari= input.nextDouble();

        System.out.println("Patlican Kaç Kilo ?   ");
        patlicanMiktari= input.nextDouble();

        double toplamTutar;
        toplamTutar=((armutMiktari*armutKilosu)+(elmaMiktari*elmaKilosu)+(domatesMiktari*domatesKilosu)+(muzMiktari*muzKilosu)+(patlicanMiktari*patlıcanKilosu)) ;
        System.out.println("Toplam Tutar ? "  +toplamTutar);

    }
}
