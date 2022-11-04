package egecoskun.Dairenin_Alanını_ve_Çevresini_Bulan_Program;

import java.util.Scanner;

public class DaireninAlanınıveÇevresiniBulanProgram {
    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System .in);
        System.out.println("Dairenin Yarı Çapını Giriniz");
        r = input.nextInt();


        double alan,cevre , 𝜋=3.14,a;
        alan = 𝜋*r*r;
        cevre=2*𝜋*r;


        System.out.println("Dairenin Alanı " +alan);
        System.out.println("Dairenin Çevresi " +cevre);
    }
}
