/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temlate1;

/**
 *
 * @author user
 */
public abstract class WebsiteTemlate {
    public void showPage(){
        System.out.println("HEADER");
        showPageContent();
        System.out.println("FOOTER");
    }
    public abstract void showPageContent();
    
}
