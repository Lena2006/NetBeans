/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testFactory3;

/**
 *
 * @author User
 */
public class BuildCompany extends Company{
  @Override
   Employee[] getEmploees(){
       System.out.println("");
       System.out.println("Starting company activity" +BuildCompany.class.getSimpleName());
               Employee[] employee = new Employee[13];
               employee[0]=new Build();
                employee[1]=new Build();
                 employee[2]=new Build();
                  employee[3]=new Build();
                   employee[4]=new Build();
                    employee[5]=new Build();
                     employee[6]=new Build();
                      employee[7]=new Build();
                       employee[8]=new Build();
                        employee[9]=new Build();
               employee[10]=new Electro();
                employee[11]=new Prorab();
                 employee[12]=new Director();
                 
                 
               return employee;
   }

    }
   

