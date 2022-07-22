
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, vucutKutleIndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vucutKutleIndeksi = kilo / (boy * boy);

        System.out.println("Vücüt Kütle İndeksiniz: " + vucutKutleIndeksi);
    }
}