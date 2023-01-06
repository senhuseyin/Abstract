package javacilik;

public class c01Kopya {
    public static void main(String[] args) {
        int sayi1=802;
        int sayi2=912;

        int kucukSayi = 0;
        int buyukSayi = 0;

        if (sayi1<sayi2){
            kucukSayi=sayi1;
            buyukSayi=sayi2;
        }else
            kucukSayi=sayi2;
        buyukSayi=sayi1;

        int flag=0;

        for (int i = kucukSayi; i > 1 ; i--) {

            if (sayi1%i==0 && sayi2%i==0){
                System.out.println("Sayilarin EBOB'u = "+i);
                flag++;
                break;
            }
        }

        if (flag==0) System.out.println("Bu sayilarin EBOB'u yoktur");


      for (int i = buyukSayi; i <= sayi1*sayi2 ; i+=buyukSayi) {

            if (i%sayi1==0 && i%sayi2==0) {
                System.out.println("Sayilarin EKOK'u = " + i);
                break;
            }
        }

    }
}
