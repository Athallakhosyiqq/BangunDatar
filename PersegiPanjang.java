package Belajar_inheritance;

public class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;
    
    @Override
    float luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return 0;
    }
    
    @Override
    float keliling(){
        double keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return 0;
    }
}
    
    

