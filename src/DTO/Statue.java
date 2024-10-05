/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
        this.weight = 0;
        this.colour = "White";
   }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void inputStatue(Scanner sc) {
        super.input(sc);
        System.out.print("Enter the weight: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the colour: ");
        colour = sc.nextLine();
        sc.close();
    }
    
    public void outputStatue() {
        super.output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+ colour);
    }
}