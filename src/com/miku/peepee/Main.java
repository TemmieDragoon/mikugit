package com.miku.peepee;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] names = {"Henk", "Kees", "Frits", "Hans", "Bertje"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }


        for (String item : names ){
            System.out.println(item);
        }

    }
}
