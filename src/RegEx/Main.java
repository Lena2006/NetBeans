/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(MyRegEx.checkPass("Lopata123"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter new password");
        
       
        
        String str = br.readLine();
        boolean result = MyRegEx.checkPass(str);
        
        while (!result){
            System.out.println("passord is NOT cheked");
            System.out.println("Enter new password");
            str = br.readLine();
            result = MyRegEx.checkPass(str);
        }
        System.out.println("password  cheked!");
        System.out.println("email new email");
        System.out.println(MyRegEx.checkEmail("Lenaka69@mail.ru"));
        
        System.out.println("введите IP адрес");
        str = br.readLine();
        System.out.println(MyRegEx.checkIP(str));
    }
  
          
}
