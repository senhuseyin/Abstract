package javacilik;

import java.util.ArrayList;
import java.util.List;

public class girilenAsalMı {
    public static void main(String[] args) {
        int girilen=5;
        int sayac=0;
        List<Integer>lst=new ArrayList<>();


        while (sayac<10){
            girilen++;

            if (isPrime(girilen)){
                lst.add(girilen);
                sayac++;
            }
        }
        System.out.println(lst);

    }public static boolean isPrime(int sayi){

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                return false;
            }

        }

        return true;
    }
}
