package jvm3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Plansza plansza = new Plansza();
        boolean czyKomplentna=true;
        plansza.wypisz();
        String wpis;
        while (czyKomplentna) {
            System.out.println("Wpisz liczbę od 1 do 9:");
            wpis=scaner.nextLine();
            int liczba=-1;
            try {
                liczba = Integer.parseInt(wpis);
            }catch (IllegalArgumentException iae){
                System.out.println("to nie jest liczba od 1 do 9");
            }
            plansza.zaznacz(liczba);
            plansza.wypisz();
            if(plansza.jestKompletna()){
                czyKomplentna=false;
            }

        }
    }
}
