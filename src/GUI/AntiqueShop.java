/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class AntiqueShop {
    public static void main (String [] args){
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("--------------------------------------\n" +
                               " - 1 - Create a Vase                  \n" +
                               " - 2 - Create a Statue                \n" +
                               " - 3 - Create a Painitng              \n" +
                               " - 4 - Display a item                 \n" +
                               " - 5 - Extit                          \n" +
                               "--------------------------------------\n" +
                               "Enter a choice:                   ");
            choice = Integer.parseInt(sc.nextLine());
        
            switch(choice){
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase(sc);
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue(sc);
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting(sc);
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object first.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    System.out.println("\n-----------------------");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option!");
            }        
        } while (choice != 5);
        sc.close();
    }
}