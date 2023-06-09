/*
 File: Main.java
 Description: This is the main file for my project and is designed to output the elevation of mountains and determine which one is the smallest.
 Created: Thur. Jun 8, 2023, 7:30 pm
 Author: Sofiya Escareno
 email: sofiyae0153@student.vvc.edu
*/

import java.text.DecimalFormat;
import java.util.ArrayList;

//This is the main driver class
public class Main {
    public static void main(String arg[]) { 
        
        //create an arraylist to store mountain objects
        ArrayList<Mountain> arrayList = new ArrayList<>(); 

        //Each mountain is added to the arraylist in the sections below
        Mountain mountain1 = new Mountain(); //The First Mountain
            mountain1.setName("Chimborazo");
            mountain1.setCountry("Ecuador");
            mountain1.setElevation(20549);
            arrayList.add(mountain1);

        Mountain mountain2 = new Mountain(); //The Second Mountain
            mountain2.setName("Matterhorn");
            mountain2.setCountry("Switzerland");
            mountain2.setElevation(14692);
            arrayList.add(mountain2); 

        Mountain mountain3 = new Mountain(); //The Third Mountain
            mountain3.setName("Olympus");
            mountain3.setCountry("Greece (Macedonia)");
            mountain3.setElevation(9573);
            arrayList.add(mountain3); 

        Mountain mountain4 = new Mountain(); //The Fourth Mountain
            mountain4.setName("Everest");
            mountain4.setCountry("Nepal");
            mountain4.setElevation(29029);
            arrayList.add(mountain4);

        Mountain mountain5 = new Mountain(); //The Fifth Mountain
            mountain5.setName("Mount Marcy - Adirondacks");
            mountain5.setCountry("United States");
            mountain5.setElevation(5344);
            arrayList.add(mountain5); 

        Mountain mountain6 = new Mountain(); //The Sixth Mountain
            mountain6.setName("Mount Mitchell - Blue Ridge");
            mountain6.setCountry("United States");
            mountain6.setElevation(6684);
            arrayList.add(mountain6); 

        Mountain mountain7 = new Mountain(); //The Seventh Mountain
            mountain7.setName("Zugspitze");
            mountain7.setCountry("Switzerland");
            mountain7.setElevation(9719);
            arrayList.add(mountain7);

        //This class is used to format decimal numbers, add the comma, and was a bit tricky to figure out
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); 
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3); 
        
        //Prints the header that displays each section of info
        System.out.printf("%-28s %-20s %-20s %-15s\n","Mountain","Country","Elevation(in feet)","Elevation(in meters)");
        
        //Print the mountains in the arraylist in the correct section
        for (Mountain mountain : arrayList) { 
            System.out.printf("%-28s %-20s ",mountain.getName(),mountain.getCountry());
            System.out.printf("%-20s %-15s\n",decimalFormat.format(mountain.getElevation())+" ft",decimalFormat.format(mountain.toMeters())+" m");
        }

        //Prints the shortest mountain statement
        System.out.printf("\nThe name of the shortest mountain is: ");

        //Finds the shortest mountain
        Mountain minMountain = minElevation(arrayList); 

        //Prints the shortest mountain data in format
        System.out.printf("%-28s \n",minMountain.getName());

        System.out.printf("\nThe elevation of the shortest mountain is: ");
        System.out.printf("%-20s",decimalFormat.format(minMountain.getElevation())+" ft");
        }

        //This function finds the shortest mountain in the arraylist
        private static Mountain minElevation(ArrayList<Mountain> arrayList) {
        int index = 0;
        double minElevation = arrayList.get(0).getElevation(); 

        //Loops over all the elements in the arraylist and updates it
        for (int i=1;i<arrayList.size();i++) {
            if (arrayList.get(i).getElevation()<minElevation) {
                index = i; 
                minElevation = arrayList.get(i).getElevation(); 
            }
        }
        //This returns the shortest mountain
        return arrayList.get(index); 
    }
}