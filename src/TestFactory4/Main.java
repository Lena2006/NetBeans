/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import java.util.List;
//import testFactory3.*;

/**
 *
 * @author User
 */
public class Main {
  public static void main(String[] args){
      Company gameCompany = new GameDevCompany();
      List computerWorkers=gameCompany.getEmploees();
      gameCompany.startWorking(computerWorkers);
      
//       BuildCompany buildCompany = new BuildCompany();
//       Employee[] buildWorkers=buildCompany.getEmploees();
//       buildCompany.startWorking(buildWorkers);
      Company buildCompany = new BuilderCompany();
      List buildWorkers=buildCompany.getEmploees();
      buildCompany.startWorking(buildWorkers);



  }
}
