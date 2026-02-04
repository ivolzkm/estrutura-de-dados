package model;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ProgramaPrincipal {
	static LinkedList<Tarefa> fila = new LinkedList<>();
	static int id = 0;

	public static void main(String[] args) throws IOException {
		int opcao;
		Scanner leitura = new Scanner(System.in);
		boolean executa = true;

		while (executa) {
			System.out.println("--Menu--");
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adiciona tarefa.");
			System.out.println("2 - Próxima tarefa.");
			System.out.println("3 - Sair.");
			opcao = leitura.nextInt();
			leitura.nextLine(); // Limpar o buffer
			switch (opcao) {
			case 1: {
				System.out.println("Qual é o nome da tarefa?");
				String nomeTarefa = leitura.nextLine();
				leitura.nextLine();
				System.out.println("Qual é a duração da tarefa?");
				int tempoTarefa = leitura.nextInt();
				leitura.nextLine();
				ProgramaPrincipal.id++;
				Tarefa tarefa = new Tarefa(id, tempoTarefa, nomeTarefa);
				fila.add(tarefa);

			}
			break;
			case 2: {
				if (fila.isEmpty()) {
					System.out.println("A fila de tarefas está vazia.");
				} else {
					Tarefa proxima = fila.removeFirst();
					System.out.println("Processando tarefa:" + proxima.getNome());
					System.out.println("ID: " + proxima.getId());
					System.out.println("Tempo: " + proxima.getTempo());
					System.out.println("Tarefa concluída!");
				}

			}
			break;

			case 3: {
				System.out.println("Encerrando.");
				executa = false;

				break;
			}
			}
		}
		leitura.close();
	}
}
