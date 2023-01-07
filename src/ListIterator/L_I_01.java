package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class L_I_01 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        ListIterator litr= sayilar.listIterator();

        while (litr.hasNext()){

            System.out.print(litr.next()+" ");
        }
        System.out.println(" ");

        while (litr.hasPrevious()){

            System.out.print(litr.previous()+" ");
        }




    }
}
