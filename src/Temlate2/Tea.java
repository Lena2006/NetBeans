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
public class Tea extends Drink {

    @Override
    public void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    public void addIngradients() {
        System.out.println("Adding Lemon");
    }

}
