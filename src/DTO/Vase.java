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
public class Vase extends Item {
    private int height;
    private String material;
     
    public Vase() {
        this.height = 0;
        this.material = "";
    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

  
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase(Scanner sc) {
        super.input(sc);    
        System.out.print("Enter the height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the material: ");
        material = sc.nextLine();
    }
    
    public void outputVase() {
        super.output();
        System.out.println("Height: "+height);
        System.out.println("Material: "+material);
    }
}
