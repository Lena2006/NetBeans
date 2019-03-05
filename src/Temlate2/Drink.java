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
public abstract class Drink {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourCup();
        addIngradients();

    }

    abstract void addIngradients();

    abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourCup() {
        System.out.println("Pouring into cup");
    }
}
