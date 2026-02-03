package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidacaoPilha {

	public static void main(String[] args) throws IOException {
		Stack<String> pilha = new Stack<>();
		BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite uma sequência de caracteres.");
		String sequencia = leitura.readLine();
		boolean valido = true;
		for (int i = 0; i < sequencia.length(); i++) {
			if ((sequencia.charAt(i) == '{') || (sequencia.charAt(i) == '[') || (sequencia.charAt(i) == '(')) {
				pilha.add(String.valueOf(sequencia.charAt(i)));
			} else if ((sequencia.charAt(i) == '}') || (sequencia.charAt(i) == ']') || (sequencia.charAt(i) == ')')) {
				if (pilha.isEmpty()) {
					valido= false;
					break;
				} else if (pilha.peek().equals("(") && sequencia.charAt(i) == ')') {
					pilha.pop();
			} else if (pilha.peek().equals("[") && sequencia.charAt(i) == ']') {
					pilha.pop();
				} else if (pilha.peek().equals("{") && sequencia.charAt(i) == '}') {
					pilha.pop();
				} else {
					valido = false;
					break;
				}
			} else {
				valido = false;
				break;
			} 

		}
		if (!pilha.isEmpty()) {
			valido = false;
		}
		if (!valido) {
			System.out.println("A sequência é inválida.");
		} else {
			System.out.println("A sequência é válida.");
		}

		leitura.close();
	}
}
