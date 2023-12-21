/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayint;

/**
 *
 * @author 040069
 */
public class ListaInt 
{
    private int lista[];
    private int count;
    
    public ListaInt(int capMax)
    {
        lista= new int[capMax];
        count=0;
    }
    
    public boolean add(int value)
    {
        if(count >= lista.length) 
        {
            System.out.println("Lista lotada.");
            return false;
        }
        
        lista[count]= value;
        count++;
        return true;
    }
    
    public void print()
    {
        for(int i=0; i<count; i++)
            System.out.print(lista[i] + "\t");
        
        System.out.println();
    }
    
    public boolean delete(int index)
    {
        if(index < 0 || index >= count)
        {
            System.out.println("Posição inválida.");
            return false;
        }
        
        for(int i=index; i<count; i++)
            lista[i]= lista[i+1];
        
        count--;
        return true;
    }
    
    public boolean insert(int index, int value)
    {
        if(count >= lista.length) 
        {
            System.out.println("Lista lotada.");
            return false;
        }
        
        if(index < 0 || index >= count)
        {
            System.out.println("Posição inválida.");
            return false;
        }
        
        for(int i= count; i>index; i--)
            lista[i]= lista[i-1];
        
        lista[index]= value;
        count++;
        return true;
    }
    
    
    
}
