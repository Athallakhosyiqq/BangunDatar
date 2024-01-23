package Belajar_inheritance;

public class Lingkaran extends BangunDatar {

    double r;
@Override
    float luas(){
        double luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return 0;
    }
    
    @Override
    float keliling(){
        double keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return 0;
}
}
