/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

import Singletone0.Singletone;

/**
 *
 * @author User
 */
public class Controller0 {
    public static void main(String[] args) {
     Boiler0 boiler = Boiler0.uniqueInstance.getInstance();
     Boiler0 boiler1 = Boiler0.uniqueInstance.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
