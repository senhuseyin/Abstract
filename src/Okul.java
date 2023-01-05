

 public class Okul extends dff {

    public Okul() {

        System.out.println("okul con");

    }

     @Override
     public void method1() {
         System.out.println("parenttaki method1 zorunlu implement edildi ******");
     }

     @Override
     public void method2() {
         System.out.println("parenttaki method2 zorunlu implement edildi --------");

     }

     public static void main(String[] args) {
       //  dff obj1=new dff();
         //Okul okl1=new Okul();
         //okl1.method1();
         //okl1.method2();
         //okl1.method3();
         dff okl2=new Okul();
         okl2.method1();
         okl2.method2();
         okl2.method3();
     }
 }

