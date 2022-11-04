package egecoskun.Taksimetre_Hesaplayan_Program;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Yolu Kilometre Cinsinden Giriniz: ");
        float gidilenYol = input.nextFloat();
        float kmBasinaUcret = 2.20F;
        float acilisUcreti = 10;
        float minUcret = 20;
        float toplamUcret = acilisUcreti + (kmBasinaUcret * gidilenYol);

        if (toplamUcret < 20)
        {
            System.out.println("Taksimetre Tutarı: " + minUcret);
        }
        else
        {
            System.out.println("Taksimetre Tutarı: " + toplamUcret);
        }
    }
}
