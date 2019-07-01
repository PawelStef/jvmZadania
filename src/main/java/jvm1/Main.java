package jvm1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Wpisz 100:");
        String wpis;
        boolean czySto=true;
        while (true){
            wpis= scaner.nextLine();

            if(wpis.equals("sto")||wpis.equals("100")){

                break;
            }
            System.out.println("Hello World!");
        }

    }
}
