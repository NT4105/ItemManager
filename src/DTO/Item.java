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
public class Item {
    Scanner sc = new Scanner (System.in);
    private int value;
    private String creator;
    
    
    public Item() {
        this.value = 0;
        this.creator = "";
    }
    public Item (int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(Scanner sc){
        boolean cont;
        do {
            cont = true;
            System.out.print("Enter the value of item: ");
            value = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the creator: ");
            creator = sc.nextLine();
            
            if (value <= 0 || creator.trim().isEmpty())
                System.out.println("Invalid Input. Please try again.");
                cont = false;
        } while (cont);
    }
    public void output(){
        System.out.println("Value: "+value);
        System.out.println("Creator: "+creator);
    }
}