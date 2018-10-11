package com.miku.quest;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo Tobias! Hoe oud ben je?");

        String input = scanner.nextLine();
        switch (input.toUpperCase()) {

            case "ZESTIEN":
            {System.out.println("Ik ben blij dat je eerlijk bent!");
                System.out.println("Wat doe je voor sport?");
                input = scanner.nextLine();
                switch (input.toUpperCase())
                {
                    case "BOOGSCHIETEN": {
                        System.out.println("Deze sport is echt super leuk!");
                        System.out.println("Welke stad woon je?");
                        input = scanner.nextLine();
                        switch (input.toUpperCase())
                        {
                            case "DEN HELDER":
                                System.out.println("Tobias. 16 jaar oud, doet aan boogschieten en woont in Den Helder.");
                                break;

                            default:
                                System.out.println("Hier woon je echt niet");

                                break;

                        }


                    } break;

                    default:
                        System.out.println("Leugenaar!");
                        break;



                }




            }break;

            default:
                System.out.println("Niet liegen over je leeftijd");
                break;




        }



    }
}