package javacilik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zoom {
    public static void main(String[] args) {
        List<String> adlar=ListeDöndür();
        System.out.println(adlar);

    }public static List<String> ListeDöndür(){

         List<String> yeniList=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

         String str="";

       while (!str.equalsIgnoreCase("q")){
           System.out.println("isim gir");
           str=scan.nextLine();
           //if (!str.equalsIgnoreCase("q")){}
               yeniList.add(str);




       }

        return yeniList;

    }

}
