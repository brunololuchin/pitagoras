package PacoteB;
import PacoteA.ClasseA;



public class ClasseC {
	Boolean logico;
	public static void main(String[] args) {
		String texto2="";
		String tabela_1="";
		String tabela_Ti="";
		String tabela_vendas="";
		int resultado;
		ClasseA objeto=new ClasseA();
		texto2 = objeto.texto;
		tabela_1 = objeto.Func;
		tabela_Ti = objeto.Func_ti;	
		tabela_vendas = objeto.Func_vendas;
		resultado = objeto.NumeroPublico;
		System.out.println(texto2);
		System.out.println(tabela_1);
		System.out.println(tabela_Ti);
		System.out.println(tabela_vendas);		
		System.out.println("As vendas foram de "+resultado+" este mes");
	}

}
