package fundamentos;
//desafio simpples
public class Temperatura {

	public static void main(String[] args) {
		double tempF = 86;
		final double DIVISAO = 5/9.0;
		final double FIXO = 32;
		double tempC = (tempF - FIXO) * DIVISAO;
		System.out.println("A temperatura em ºC é: " + tempC);
		
		tempF = 0;
		tempC = (tempF - FIXO) * DIVISAO;
		System.out.println("A temperatura em ºC é: " + tempC);
	}
}
