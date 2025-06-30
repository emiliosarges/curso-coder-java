package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; --> esse atribuição gera erro, pois a variável c é uma string por inferência
		
		double d; //variável foi declarada
		d = 123.65; //variável foi inicializada
		System.out.println(d);
		
		var e = 123.45;    //Se declarar com var é preciso já iniciar a variável.
		System.out.println(e);
		
		var f = 12;
		//f = 12.2; Apresenta erro, pois a variável f foi iniciar com um inteiro.
		System.out.println(f);
		
		var g = 12.2;
		g = 12;
		System.out.println(g); 
		//nesse caso apresenta erro pois os n inteiros estão dentro dos n decimais.
		
		double z = 3;
		z = 1.5;
		System.out.println(z);
	}
}
