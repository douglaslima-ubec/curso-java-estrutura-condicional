import java.util.Scanner;

public class EstruturaCondicional {

	private static Scanner sc = new Scanner(System.in);

	public static void calcularValorTelefonia() {
		int minutos = sc.nextInt(); // lê a quantidade de minutos
		double valor = 50;
		if (minutos > 100) {
			valor += (minutos - 100) * 2;
		}
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
	}

	public static void diaDaSemana() {
		int numero = sc.nextInt();
		String diaDaSemana;
		switch (numero) {
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
		System.out.println("Dia da semana: " + diaDaSemana);
	}

	public static void calcularDesconto() {
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		preco -= desconto;
		System.out.printf("Preço com desconto de R$ %.2f: R$ %.2f%n", desconto, preco);
	}

	public static void numeroNegativoOuPositivo() {
		int numero = sc.nextInt();
		if (numero >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
	}

	public static void numeroParOuImpar() {
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}

	public static void saoMultiplos() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		if ((A > B && A % B == 0) || (B > A && B % A == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}

	public static void calcularDuracaoJogo() {
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		if (horaInicial == horaFinal) {
			duracao = 24;
		} else if (horaInicial > horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
		} else {
			duracao = horaFinal - horaInicial;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
	}

	public static void calcularConta() {
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;
		switch (codigo) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
		}
		double total = preco * quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
	}

	public static void calcularIntervalo() {
		double valor = sc.nextDouble();
		if (valor < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (valor <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (valor <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (valor <= 100) {
			System.out.println("Intervalo (75,100]");
		}
	}

	public static void calcularPosicao() {
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if (y == 0 && x != 0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
	}

	public static void calcularImposto() {
		double salario = sc.nextDouble();
		double imposto = 0;
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			imposto += (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n",imposto);
		} else if (salario <= 4500.00) {
			imposto += 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
			System.out.printf("R$ %.2f%n",imposto);
		} else {
			imposto += 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
			System.out.printf("R$ %.2f%n",imposto);
		}
	}

}
