abstract class Mamifero {
        public abstract double obterCotaDiariaDeLeite();
}
class Elefante extends Mamifero{
	public double obterCotaDiariaDeLeite() {
		return 20.0;
	}
}

class Rato extends Mamifero{
	public double obterCotaDiariaDeLeite() {
		return 0.5;
	}
}
class Aplicativo{
	public static void main(String[]args) {
		System.out.println("Teste de polimorfismo\n");
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diaria de Leite de Elefante:" + mamifero1.obterCotaDiariaDeLeite());
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diaria de Leite de Rato: " + mamifero2.obterCotaDiariaDeLeite());
	}
}