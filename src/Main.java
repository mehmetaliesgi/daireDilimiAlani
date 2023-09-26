import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, alan;
        int yariCap, merkezAcisi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        yariCap = input.nextInt();

        System.out.print("Lütfen dairenin merkez açısını giriniz: ");
        merkezAcisi = input.nextInt();

        alan = (pi * yariCap * yariCap * merkezAcisi) / 360;

        System.out.println("Alan: " + alan);
    }
}