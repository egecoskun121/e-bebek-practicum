package egecoskun.KDV_Tutari_Hesaplayan_Program;

import java.util.Scanner;

public class KDV_Tutari_Hesaplayan_Program {
    public static void main(String[] args) {
        double tutar,kdv;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tutar gir");
        tutar=scan.nextDouble();
        if(tutar<1000){
            kdv=tutar*0.18;
        }else{
            kdv=tutar*0.8;
        }
        System.out.println(kdv+tutar);
    }
}
