package Empresa;

public class TesteEmpresa {
	public static void main(String[] args) {
	Ti ti= new Ti();
	ti.setNome("Teste");
	System.out.println(ti.getNome());
	Vendas vendas=new Vendas();
	vendas.setCpf("0708573802");
	System.out.println(vendas.getCpf());
	}
}
