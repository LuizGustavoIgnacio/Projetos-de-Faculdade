package tecelagem;

public class Vendas extends Funcionario
{
    private double totVendas;

    public Vendas(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totVendas= 0;
    }
    
    public void registrarVenda(double valor)
    {
        totVendas+= valor;
    }
    
    private double comissao()
    {
        return totVendas * 0.03;
    }
    
    @Override
    public double salarioLiquido( )
    {
        return salBase + comissao();
    }
    
    @Override
    public void novoMes( )
    {
        totVendas= 0;
                
    }

    public void hollerith( )
    {
        super.hollerith();
        System.out.printf("Total de vendas: %.2f\nComissão: %.2f\n\n", 
                totVendas, comissao());
    }
    
    
    
}
