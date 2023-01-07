package Iterator01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListeratorIstenmeyen {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){
      Integer sayi=(Integer)lit.next();
            System.out.print(sayi+" ");

        }
        System.out.println(" ");
        System.out.println(sayilar);


        while (lit.hasPrevious()){


            System.out.print(lit.previous()+" ");
        }
        System.out.println(" ");
        System.out.println(sayilar);
    }
}
