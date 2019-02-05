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
public class Main {
  public static void main(String[] args){
      Company gameCompany = new GameDevCompany();
     Company cleanerCompany =new CleanerCompany();
      Employee[] computerWorkers=gameCompany.getEmploees();
      Employee[] cleanerWorkers= cleanerCompany.getEmploees();
      
      gameCompany.startWorking(computerWorkers);
      cleanerCompany.startWorking(cleanerWorkers);
      
       BuildCompany buildCompany = new BuildCompany();
       Employee[] buildWorkers=buildCompany.getEmploees();
       buildCompany.startWorking(buildWorkers);
      
  }
}
