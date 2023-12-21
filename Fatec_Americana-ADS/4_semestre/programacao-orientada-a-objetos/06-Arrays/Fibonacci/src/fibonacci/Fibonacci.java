/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author 040069
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        long fibo[]= new long[50];
        
        fibo[0]= 0;
        fibo[1]= 1;
        
        for(int i=2; i<fibo.length; i++)
            fibo[i]= fibo[i-1]+fibo[i-2];
        
        for(int i=0; i<fibo.length; i++)
            System.out.println("["+i+"]: " + fibo[i]);
                    
    }
    
}
