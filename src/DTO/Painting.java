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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting() {
        this.height = 0;
        this.width = 0;
        this.isWatercolour = false;
        this.isFramed = false;
    }
    
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        super.output();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("WaterColour: "+isWatercolour);
        System.out.println("Framed: "+isFramed);
    }
    
    public void inputPainting(Scanner sc) {
        super.input(sc);
        System.out.print("Enter the height: "+ height);
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the width: "+width);
        width = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Watercolour: "+ isWatercolour);
        isWatercolour = sc.nextBoolean();
        System.out.println("Enter Framed: "+isFramed);
        isFramed = sc.nextBoolean();
        sc.close();
    }
}
