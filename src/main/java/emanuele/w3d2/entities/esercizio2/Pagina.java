package emanuele.w3d2.entities.esercizio2;

public class Pagina extends ComponenteLibro {
	private int numeroPagina;
	
	
	public Pagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
		
	}
	@Override
	public int getNumeroPagine() {
		return 1;
	}

	@Override
	public void stampa() {
		System.out.println("Stampa pagina: " + numeroPagina);
		
	}

}
