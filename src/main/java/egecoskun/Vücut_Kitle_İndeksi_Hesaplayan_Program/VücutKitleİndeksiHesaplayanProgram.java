package egecoskun.Vücut_Kitle_İndeksi_Hesaplayan_Program;

import java.util.Scanner;

public class VücutKitleİndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo =  scanner.nextInt();
        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
