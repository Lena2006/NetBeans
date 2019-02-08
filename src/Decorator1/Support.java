/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author User
 */

 public class Support extends DeveloperDecorator{
    
    
    
    public Support(Developer developer) {
        super(developer);
    }
    public String supForClient(){
        return  ".....support into client.....";
    }
    @Override
    public String makeJob(){
        return super.makeJob()+ supForClient();
    }
    
}
   

