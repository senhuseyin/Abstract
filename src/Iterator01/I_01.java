package Iterator01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I_01 {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);

        for (int i = 0; i < sayilar.size(); i++) {
            System.out.print(i+3+" ");
        }
        System.out.println("");

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next()+"/");

        System.out.println(itr.hasNext());
        System.out.println(itr.hasNext());

        itr= sayilar.iterator();

        while (itr.hasNext()){

            System.out.print(itr.next()+ " ");

        }
        System.out.println("");

        itr= sayilar.iterator();

        while (itr.hasNext()){


            if ((Integer)itr.next()>5){
                itr.remove();
            }
        }
        System.out.println(sayilar);


    }
}
