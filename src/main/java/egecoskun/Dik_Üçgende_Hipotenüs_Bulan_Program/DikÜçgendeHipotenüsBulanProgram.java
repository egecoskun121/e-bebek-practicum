package egecoskun.Dik_Üçgende_Hipotenüs_Bulan_Program;

import java.util.Scanner;

public class DikÜçgendeHipotenüsBulanProgram {
    public static void main(String[] args) {
        int x,y,z,cevre;
        double u,alan;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1. kenar uzunlugunu giriniz : ");
        x=scan.nextInt();
        System.out.print("Lutfen 2. kenar uzunlugunu giriniz : ");
        y=scan.nextInt();
        System.out.print("Lutfen 3. kenar uzunlugunu giriniz : ");
        z=scan.nextInt();

        boolean ucgenOlmasarti=((x+y)>z)&&((x+z)>y)&&((y+z)>x);

        cevre=x+y+z;
        u=cevre/2;
        alan=u*(u-x)*(u-y)*(u-z);

        System.out.println("Kenar uzunluklarini girdiginiz ucgenin alani : "+alan);
    }
}
