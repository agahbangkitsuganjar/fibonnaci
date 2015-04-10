/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.*;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int countNumber;
        countNumber = inputan.nextInt();
         
         System.out.print(1 + " ");
          
        for(int i=0,start=1,count=0,pass=0;i<countNumber-1;i++){
              count=start+pass;
            pass=start;
            start=count;
            System.out.print(count+ " ");
       }
    }
    
}
