package escola;

public class Pessoa 
{
    private String nome, sobrenome;

    public Pessoa(String nome, String sobrenome) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public Pessoa(Pessoa p)
    {
        this(p.nome, p.sobrenome);
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }
    
    public void printNome()
    {
        System.out.println(nome + " " + sobrenome);
    }

} /////////////////////// Classe Pessoa
