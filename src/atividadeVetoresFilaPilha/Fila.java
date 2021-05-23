package atividadeVetoresFilaPilha;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Fila {
	public static void main(String[] args) {

		String nome[] = new String[20];

		int idade[] = new int[20];

		String descricao[] = new String[20];

		Object escolha;

		Scanner teclado = new Scanner(System.in);

		int contador = 0;

		int atender;

		do {

			Object[] categoria = { "Incluir Paciente", "Atender Paciente", "Sair" };

			escolha = JOptionPane.showInputDialog(null, "O que voc� deseja fazer?", "T�tulo", JOptionPane.PLAIN_MESSAGE,
					null, categoria, "");

			if (escolha.equals("Incluir Paciente")) {

				if (nome[19] != null) {

					System.out.println("\nJa existe 20 Pacientes na fila.");

				} else {

					if ((nome[19] == null) && (nome[18] != null)) {

						System.out.println("Digite o Nome do " + (19 + 1) + "� Paciente");
						nome[19] = teclado.next();

						System.out.println("Digite a Idade do " + (19 + 1) + "� Paciente");
						idade[19] = teclado.nextInt();

						System.out.println("Digite a Descri��o do " + (19 + 1) + "� Paciente");
						descricao[19] = teclado.next();

						contador++;

					} else {

						System.out.println("Digite o Nome do " + (contador + 1) + "� Paciente");
						nome[contador] = teclado.next();

						System.out.println("Digite a Idade do " + (contador + 1) + "� Paciente");
						idade[contador] = teclado.nextInt();

						System.out.println("Digite a Descri��o do " + (contador + 1) + "� Paciente");
						descricao[contador] = teclado.next();

						contador++;

					}

				}

			} else if (escolha.equals("Atender Paciente")) {

				System.out.println("Digite o Numero do Paciente que deseja atender");
				atender = teclado.nextInt() - 1;

				if (nome[atender] == null) {

					System.out.println("\nN�o existe um paciente de Numero " + atender);

				} else {

					System.out.println("\nO paciente " + nome[atender] + " foi atendido.\n");

					int j = atender + 1;

					for (; atender < 19; atender++) {

						nome[atender] = nome[j];
						idade[atender] = idade[j];
						descricao[atender] = descricao[j];

						j++;
					}

					nome[19] = null;
					idade[19] = 0;
					descricao[19] = null;

					contador--;

					for (int i = 0; i < 20; i++) {

						if (nome[i] == null) {

							System.out.println("Esta vaga esta Livre");

						} else {

							System.out.println("O paciente de Numero " + (i + 1) + "� " + nome[i] + " tem " + idade[i]
									+ " anos, e sua descri��o � " + descricao[i]);

						}
					}

				}

			}

		} while (!escolha.equals("Sair"));

		System.out.println("\n");

		for (int i = 0; i < 20; i++) {

			if (nome[i] == null) {

				System.out.println("Esta vaga esta Livre");

			} else {

				System.out.println("O paciente de Numero " + (i + 1) + "� " + nome[i] + " tem " + idade[i]
						+ " anos, e sua descri��o � " + descricao[i]);

			}
		}

	}
}