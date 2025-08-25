/*
 * Exercício de recursividade, cálculo de fatorial (limite de 12 interações).
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.CalcularFatorialController;

public class Principal {
	public static void main(String[] args) {
		CalcularFatorialController controle = new CalcularFatorialController();
		int numero = 8;
		int resultado = controle.fatorial(numero);
		System.out.println("O fatorial de " + numero + " é " + resultado + ".");
	}
}
