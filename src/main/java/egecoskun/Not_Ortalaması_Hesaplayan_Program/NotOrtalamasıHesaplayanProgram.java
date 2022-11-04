package egecoskun.Not_Ortalaması_Hesaplayan_Program;

import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {




    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner scan = new Scanner(System.in);
        mat=scan.nextInt();
        fizik=scan.nextInt();
        kimya=scan.nextInt();
        tarih=scan.nextInt();
        turkce=scan.nextInt();
        muzik=scan.nextInt();

        int avg=mat+fizik+tarih+turkce+muzik+kimya/6;
        if(avg>60){
            System.out.println("Sınıfı geçti");
        }else{
            System.out.println("Sınıfta kaldı");
        }
    }
}
