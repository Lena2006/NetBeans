/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template4;



/**
 *
 * @author user
 */
public abstract class Drink {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourCup();
       if (customerWantsIngridients()){
           addIngridients();
       }

    }

    abstract void addIngridients();

    abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourCup() {
        System.out.println("Pouring into cup");
    }
    boolean customerWantsIngridients(){
        return true;
    }

}
