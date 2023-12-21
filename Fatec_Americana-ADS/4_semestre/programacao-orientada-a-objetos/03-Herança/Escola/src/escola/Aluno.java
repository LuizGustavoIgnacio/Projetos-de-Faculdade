package escola;

public class Aluno extends Pessoa
{
    private String ra;
    private double nota1, nota2;
    private int faltas;

    public Aluno(String nome, String sobrenome, String ra) 
    {
        super(nome, sobrenome);
        this.ra = ra;
        this.nota1= 0;
        nota2= 0;
        faltas= 0;
    }
    
    public Aluno(Aluno a)
    {
        super(a);
        ra= a.ra;
        faltas= a.faltas;
        nota1= a.nota1;
        nota2= a.nota2;
    }

    public String getRa() 
    {
        return ra;
    }

    public void setRa(String ra) 
    {
        this.ra = ra;
    }
    
    public void faltou()
    {
        faltas++;
    }    
    
    public void prova1(double nota1)
    {
        if(nota1 >=0 && nota1 <= 10)
            this.nota1= nota1;
    }
    
    public void prova2(double nota2)
    {
        if(nota2 >=0 && nota2 <= 10)
            this.nota2= nota2;
    }
    
    public double media()
    {
        return (nota1+nota2)/2;
    }
    
    
    public boolean aprovado()
    {
        return (media() >= 6 && faltas < 20);
    }
    
    public void print()
    {
        printNome();
        System.out.println("Faltas: " + faltas);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media());
        System.out.println("Aprovado: " + (aprovado()?"Sim":"Não"));
    }
}
