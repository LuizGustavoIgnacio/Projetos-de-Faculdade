/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiraclasse;

/**
 *
 * @author 040069
 */
public class Pessoa 
{
    private String nome, sobrenome;

    // Construtor
    public Pessoa(String vNome, String vSobrenome)
    {
        if(!vNome.isBlank()) nome= vNome;
        if(!vSobrenome.isBlank()) sobrenome= vSobrenome;
        
    }

    // Setters: métodos especializados em atribuir valores aos atributos.
    public void setNome(String valNome)
    {
        if(!valNome.isBlank())
            nome= valNome;
    }
    
    public void setSobrenome(String valSobrenome)
    {
        if(!valSobrenome.isBlank())
            sobrenome= valSobrenome;
    }
    
    // Getters: métodos feitos para retornar o valor dos atributos.
    public String getNome()
    {
        return nome;
    }
    
    public String getSobrenome()
    {
        return sobrenome;
    }
    
    // Outros métodos
    public void print()
    {
        System.out.println(nome + " " + sobrenome);
    }
    
    // Método que RETORNE o nome e sobrenome no formato de 
    // referência bibliográfica,
    // ou seja: sobrenome, nome
    
    public String refBib()
    {
        return sobrenome + ", " + nome;
    }
} ////////////////////////////////// Classe Pessoa
