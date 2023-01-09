package javacilik;

public class innerLoop {
    public static void main(String[] args) {

        String[][]foods={{"ekmek","kraker","cips"},{"su","kola","ayran"},{"tuz","seker","reyhan"},{"tencere","tava","sahan"}};

        for (int i = 0; i < foods.length; i++) {

            for (int j = 0; j <foods[i].length ; j++) {

                System.out.println(foods[i][j]);

            }

            System.out.println("--------------");

        }
        System.out.println("for each ile");

        for (String[] ülkeler:foods) {
            for (String yemek : ülkeler) {

                System.out.println(yemek);
            } System.out.println("--------------");}

        }
    }

