package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno a1= new Aluno("Zé", "Carioca", "12345-6");
        a1.print();
        a1.prova1(6);
        a1.prova2(8);
        a1.faltou();
        a1.faltou();
        a1.faltou();
        a1.faltou();
        
        a1.print();
    }
    
}
