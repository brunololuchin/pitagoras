
public class Teste {
	public static void main(String[] args) {
		Professor professor= new Professor();
		professor.setNome("Teste");
		System.out.println(professor.getNome());
		Aluno aluno=new Aluno();
		aluno.setCurso("Eng Computa��o");
		System.out.println(aluno.getCurso());
	}

}
