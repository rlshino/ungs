package tp3_2017_c1;

public class Test {
	/*** @paramargs */
	public static void main(String[] args) {// TODOAuto-generated method stub
		PPTLS pptls = new PPTLS();
		pptls.agregarElemento("Piedra");
		pptls.agregarElemento("Papel");
		pptls.agregarElemento("Tijera");
		pptls.agregarElemento("Lagarto");
		pptls.agregarElemento("Spock");// ...
		pptls.agregarElementoParecido( "Piedra","Piedra Roja");
		pptls.agregarElementoParecido("Papel","Papel A4");
		pptls.agregarRegla("Piedra", "Papel");
		
		pptls.agregarRegla("Spock", "Piedra");// Piedra >Papel
		System.out.println(pptls.jugar("Piedra", "Spock"));
	}
}
