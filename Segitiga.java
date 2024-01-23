package Belajar_inheritance;

public class Segitiga extends BangunDatar {

    double alas;
    double tinggi;

    @Override
    float luas() {
        double luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return 0;
    }
}
