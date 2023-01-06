package javacilik;

public class c01 {
    public static void main(String[] args) {
        // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
       int sayi1=25;
       int sayi2=80;
        int küçükSayi=0;
        int büyükSayi=0;
        int flag=0;

        if (sayi1<sayi2){
            küçükSayi=sayi1;
            büyükSayi=sayi2;
        }else {
            küçükSayi=sayi2;
            büyükSayi=sayi1;
        }
        for (int i = küçükSayi; i >=2; i--) {

            if (sayi1%i==0&&sayi2%i==0){
                System.out.println("ebob ="+i);
            }
            flag++;

        }if (flag==0){
            System.out.println("sayilarin ebobu yoktur.");
        }
        for (int i=büyükSayi; i <=sayi2*sayi1 ; i+=büyükSayi) {

            if (i%sayi1==0&&i%sayi2==0){
                System.out.println("EKOK= "+i);
            }break;

        }
    }
}
