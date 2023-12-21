/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayint;

/**
 *
 * @author 040069
 */
public class ArrayInt 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ListaInt li= new ListaInt(10);
        
        li.add(3);
        li.add(7);
        li.add(2);
        li.add(8);
        li.add(1);
        li.add(10);
        
        li.print();
        
        li.delete(3);
        
        li.print();
        
        li.insert(3, 8);
        li.print();
    }
    
}
