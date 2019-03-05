/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temlate2;

/**
 *
 * @author user
 */
public class Barista {
    public static void main(String[] args) {
        Drink tea = new Tea();
        Drink coffee = new Coffee();
        System.out.println("Making tea....");
        System.out.println("\n====================\n");
        tea.prepareRecipe();
        System.out.println("\n====================\n");
        System.out.println("Making coffee...");
        System.out.println("\n====================\n");
        coffee.prepareRecipe();
    }
}
