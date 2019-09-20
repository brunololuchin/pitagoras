package Empresa;

public class Vendas extends Funcionario{
	private float Vendas;
	private String Setor;
	
	public float getVendas() {
		return Vendas;
	}
	public void setVendas(float vendas) {
		Vendas = vendas;
	}
	public String getSetor() {
		return Setor;
	}
	public void setSetor(String setor) {
		Setor = setor;
	}
	
	private int CalcularMediaVendas() {
		return 0;
	}
	
	

}
