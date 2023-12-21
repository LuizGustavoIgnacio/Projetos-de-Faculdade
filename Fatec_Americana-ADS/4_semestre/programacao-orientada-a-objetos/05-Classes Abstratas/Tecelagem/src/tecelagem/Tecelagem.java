package tecelagem;

public class Tecelagem {

    public static void main(String[] args) 
    {
        Administracao a1= new Administracao("José", "1234567-8", 10000);
        a1.registrarFalta();
        a1.hollerith();
        
        Producao p1= new Producao("Maria", "2345678-9", 50);
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        Vendas v1= new Vendas("Joca", "3456789-0", 1000);
        v1.registrarVenda(100000);
        v1.hollerith();
    }
    
}
