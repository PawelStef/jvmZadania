package jvm2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length>=1 ){
            int liczba=0;
            try{
                liczba= Integer.parseInt(args[0]);

            }catch (IllegalArgumentException iae){
                System.out.println("w args[1] nie przekazano liczby");
            }
            for (int i = 0; i < liczba; i++) {
                System.out.println("Hello World!");
            }

        }else{
            Scanner scaner = new Scanner(System.in);
            System.out.println("Wpisz liczbę:");
            String wpis;
            boolean czySto=true;
            while (czySto){
                wpis= scaner.nextLine();
                int liczba=0;
                try {
                    liczba = Integer.parseInt(wpis);
                    czySto=false;
                }catch (IllegalArgumentException e){
                    System.out.println("to nie liczba");
                }
                for (int i = 0; i < liczba; i++) {
                    System.out.println("Hello World!");
                }
            }
        }


    }
}
