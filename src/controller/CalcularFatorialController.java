/*
 * Exercício de recursividade, cálculo de fatorial (limite de 12 interações).
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class CalcularFatorialController {

	public CalcularFatorialController() {
		super();
	}
	
	public int fatorial(int base) {
		// Condição de parada, quando o valor base para o fatorial chegar a zero,
		// pois 0! é 1.
		if (base == 0) {
			return 1;
		}
		// Para o fatorial, o número escolhido é a base, que deve ser multiplicada
		// pela escolha, diminuída de 1.
		else {
			return base * fatorial(base - 1);
		}
	}
}
