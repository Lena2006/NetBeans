/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import java.util.List;
import testFactory3.*;

/**
 *
 * @author User
 */
public abstract class Company {
 List getEmploees(){
     return null;
     
 };
 
 void startWorking(List<Employee> empoeers){
     for ( Employee emp : empoeers){
         emp.doWork();
     }
 };
}
