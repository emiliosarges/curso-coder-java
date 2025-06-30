package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAumulados = 3_134_845_223L;
		
		// Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumulads = 2_991_797_103.01; 
		
		// Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'a'; // ativo - Suporta apenas uma letra. 
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAumulados / vendasAcumulads);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}
}
