package Belajar_inheritance;

public class Persegi extends BangunDatar {

    float sisi;

    @Override
    float keliling() {
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
    float luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }
}
