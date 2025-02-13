package application;

import java.util.Locale;
import java.util.Scanner;

import application.exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.err.println("Erro nos parametros: " + e.getMessage());
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

	}

	static void contar(int parametroUm, int parametroDois )  throws ParametrosInvalidosException{
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;	
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("primeiro parametro é MAIOR que  segundo parametro!");
		}
		
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 1; i <= contagem;i++ ) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
