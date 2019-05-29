import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class lab_6 {

    public static void main(String[] args) {
        PreciousStones diamond = new PreciousStones("diamond","PreciousStone",
                                                    "Internally Flawless", 1.25, 8900);
        PreciousStones emerald = new PreciousStones("emerald", "PreciousStone",
                                                    "Very Slightly Included",1.25, 760);
        PreciousStones nephrite = new PreciousStones("nephrite", "Semi-preciousstone",
                                                     "Included", 1.25, 15);


        String[] GIA = {"Included", "Slightly included",
                "Very Slightly Included", "Internally Flawless", "Flawless"};
        PreciousStones[]ArrayOfPreciousStones = {diamond, emerald, nephrite};
        String[]ArrayOfPreciousStonesGroups =  {diamond.getGroup(), emerald.getGroup(), nephrite.getGroup()};
        Arrays.sort(ArrayOfPreciousStonesGroups);

        for(PreciousStones s: ArrayOfPreciousStones) {
            System.out.printf("name: %s\ngroup %s\nprice for 1.25 carat: %d\n\n",
                              s.getName(), s.getGroup(), s.getCost());

        }

        System.out.print("Type how many stones you want to use:\n");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        PreciousStones [] necklace = new PreciousStones[amount];
        int [] price = new int[amount];

        for (int i = 0; i<amount; i++) {
            System.out.print("Select the stone\n1.Diamond\n2.Emerald\n3.Nephrite\n");
            Scanner scann = new Scanner (System.in);
            int stone = scann.nextInt();
            switch (stone){
                case 1 :
                    necklace[i] = diamond;
                    System.out.print("How many stones of this type do you want?");
                    Scanner scannn = new Scanner(System.in);
                    price[i] = scannn.nextInt();
                    break;
                case 2:
                    necklace[i] = emerald;
                    System.out.print("How many stones of this type do you want?");
                    Scanner scannnn = new Scanner(System.in);
                    price[i] = scannnn.nextInt();
                    break;
                case 3:
                    necklace[i] = nephrite;
                    System.out.print("How many stones of this type do you want?");
                    Scanner scannnnn = new Scanner(System.in);
                    price[i] = scannnnn.nextInt();
                    break;
            }
        }

        int sumWeight = 0;
        int sumPrice = 0;
        for (int i = 0; i < price.length; i++){
            sumWeight += necklace[i].getWeight() * price[i];
            sumPrice += necklace[i].getCost() * price[i];
        }

        System.out.printf("Weight of your necklace:%d\nPrice:%d\n", sumWeight, sumPrice);

        System.out.println("Find stones for your necklace\nChoose clarity level (I-1, FL-5)\nLow: ");
        Scanner bottom = new Scanner(System.in);
        int flour = bottom.nextInt();
        System.out.println("Top: ");
        Scanner top = new Scanner(System.in);
        int ceiling = top.nextInt();
        for (PreciousStones s: ArrayOfPreciousStones){
           L: for (int i = 1; i < GIA.length+1; i++ ){
              // System.out.println(GIA[i-1]+ " " + s.getClarity());
                if (i < flour | i > ceiling){
                    continue;
                } else{
                    if (GIA[i-1].equals(s.getClarity())) {
                        System.out.printf("You can use %s\n", s.getName());
                        break L;
                    }
                }
            }
        }
        System.out.println("All the compilations are done. Thank you for using this software");
    }

}