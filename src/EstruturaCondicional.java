import java.util.Scanner;
import java.util.Locale;

public class EstruturaCondicional {

	private static Scanner sc = new Scanner(System.in);
	
	public static void calcularValorTelefonia() {
		Locale.setDefault(Locale.US);
		int minutos = sc.nextInt(); //lê a quantidade de minutos
		double valor = 50;
		if(minutos>100) {
			valor += (minutos-100)*2;
		}
		System.out.printf("Valor a pagar: R$ %.2f%n",valor);
	}
	
	public static void diaDaSemana() {
		int numero = sc.nextInt();
		String diaDaSemana;
		switch(numero) {
			case 1:
				diaDaSemana = "domingo";
				break;
			case 2:
				diaDaSemana = "segunda";
				break;
			case 3:
				diaDaSemana = "terça";
				break;
			case 4:
				diaDaSemana = "quarta";
				break;
			case 5:
				diaDaSemana = "quinta";
				break;
			case 6:
				diaDaSemana = "sexta";
				break;
			case 7:
				diaDaSemana = "sábado";
				break;
			default:
				diaDaSemana = "valor inválido";
		}
		System.out.println("Dia da semana: "+diaDaSemana);
	}
	
	public static void calcularDesconto() {
		double preco = sc.nextDouble();
		double desconto = (preco<20) ? preco*0.1 : preco*0.05;
		preco -= desconto;
		System.out.printf("Preço com desconto de R$ %.2f: R$ %.2f%n",desconto,preco);
	}
	
	public static void numeroNegativoOuPositivo() {
		int numero = sc.nextInt();
		if(numero>=0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
	}
	
	public static void numeroParOuImpar() {
		int numero = sc.nextInt();
		if(numero%2==0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
	}

}
