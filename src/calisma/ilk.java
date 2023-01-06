package calisma;

import java.util.ArrayList;
import java.util.List;

public class ilk {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("seda");
        isimler.add("eda");
        isimler.add("meda");
        isimler.add("kimdir");
      döndür(isimler,"m");
        System.out.println(isimler);


    }public static List<String> döndür(List<String> adlar,String str){
        List<String> kalanlar=new ArrayList<>();
        String alacaklar="";

        for (int i = 0; i < adlar.size(); i++) {

            if (!adlar.contains(str)){
                alacaklar+=(char)i;
            }


        }kalanlar.add(alacaklar);
        System.out.println(alacaklar);


        return kalanlar;

    }
}
