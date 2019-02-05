/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import java.util.ArrayList;
import java.util.List;
//import testFactory3.*;

/**
 *
 * @author User
 */
public class BuilderCompany extends Company{
   @Override
   List getEmploees(){
       System.out.println("");
       System.out.println("Starting company activity" +BuilderCompany.class.getSimpleName()+"\n");
             List employee=new ArrayList();  
               employee.add (new director());
               
               employee.add(new electrik());
               employee.add(new prorab());
              
               for (int i=1; i<=10;i++){
                   employee.add(new build());
               }
               return employee;
   
   }
}
