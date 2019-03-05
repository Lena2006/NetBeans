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
public class WebsiteRunner {

    public static void main(String[] args) {
        WebsiteTemlate welcomPage = new WelcomePage();
        WebsiteTemlate newsPage = new NewsPage();
        WebsiteTemlate shopPage = new ShopPage();

        welcomPage.showPage();
        System.out.println("\n========================\n");
        newsPage.showPage();
        
        System.out.println("\n========================\n");
        shopPage.showPage();
    }
}
