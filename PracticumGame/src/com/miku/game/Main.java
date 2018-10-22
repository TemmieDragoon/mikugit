package com.miku.game;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean runGame = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] Commands = {"hoger", "lager", "exit"};

        double getalStart = 0;
        double getalEind = 0;


        while ( runGame ) //runGame == true
        {
            getalStart = Math.ceil(Math.random() * 10);

            System.out.println("Het start getal is " + getalStart);

            //INPUT CONTROL:
            boolean geldigeInput = false;
            while (geldigeInput == false)
            {
                input = scan.nextLine();
                input = input.toLowerCase();

                for(int i = 0; i < Commands.length; i++)
                {
                    if(input.equals(Commands[i]))
                    {
                        geldigeInput = true;
                        break; // Breek de huidige loop
                    }
                }
            }


            // DATA UPDATE, GAME MAG VERDER:
            getalEind = Math.ceil(Math.random() * 10);

            boolean win = false;
            if( input.equals( Commands[0])) //Hoger
            {
                if(getalEind > getalStart)
                {
                    //gewonnen
                    win = true;
                }
            }
            else if( input.equals( Commands[1])) //Lager
            {
                if(getalEind < getalStart)
                {
                    //gewonnen
                    win = true;
                }

            }
            else
            {
                //exit
                runGame = false;
                continue; //Stopt de verdere code in de loop en gaat verder met de volgende iteratie

            }

            // Eind resultaat tonen

            System.out.println("Het startgetal is " + getalStart);
            System.out.println("Het eindgetal is " + getalEind);

            if(win) {
                System.out.println("Je hebt gewonnen!");
            }
            else {
                System.out.println("Je hebt verloren!");
            }


        }

    }
}
