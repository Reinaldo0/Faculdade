package atividadeVetoresFilaPilha;

import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Pilha {

	public static void main(String[] args) {

		String[] identCaixa = new String[10];
		String[] efragil = new String[10];

		int[] largura = new int[10];
		int[] altura = new int[10];
		int[] profundidade = new int[10];

		Object[] fragil = { "Sim", "Não" };

		int opcao;
		int contador = 0;
		boolean loop = true;

		Scanner teclado = new Scanner(System.in);

		while (loop) {
			System.out.println(
					"Escolha uma opção.\n" + " 1 - Incluir Caixa.\n" + " 2 - Retirar Caixa.\n" + " 3 - Sair. ");
			opcao = teclado.nextInt();

			if (opcao != 1 && opcao != 2 && opcao != 3) {
				throw new IllegalArgumentException("Opção Invalida.");
			}

			switch (opcao) {
			case 1:

				System.out.println("Informe o Identificador da caixa a ser adicionada.");
				identCaixa[contador] = teclado.next();

				System.out.println("Informe a altura da caixa.");
				altura[contador] = teclado.nextInt();

				System.out.println("Informe a largura da caixa.");
				largura[contador] = teclado.nextInt();

				System.out.println("Informe a profundidade da caixa.");
				profundidade[contador] = teclado.nextInt();

				Object escolha = JOptionPane.showInputDialog(
			            null,
				    "O conteudo da caixa é fragil?",
				    "Título",
				    JOptionPane.PLAIN_MESSAGE,
				    null,
				    fragil,
				    ""
			        );

				if (escolha.equals("Sim")) {

					efragil[contador] = "É fragil";

				} else {

					efragil[contador] = "Não é fragil";

				}

				contador++;

				for (int i = 0; i < 10; i++) {

					if (identCaixa[i] != null) {

						System.out.println("Caixas cadastradas " + identCaixa[i] + " com " + largura[i]
								+ " de largura, " + altura[i] + " de altura, " + profundidade[i] + " de profundidade e "
								+ efragil[i]);
					}

				}

				System.out.println("\n");

				break;
			case 2:

				contador--;

				System.err.println("A caixa " + identCaixa[contador] + " foi removida.");
				identCaixa[contador] = null;

				for (int i = 0; i < 10; i++) {

					if (identCaixa[i] != null) {

						System.out.println("Caixas cadastradas " + identCaixa[i] + " com " + largura[i]
								+ " de largura, " + altura[i] + " de altura, " + profundidade[i] + " de profundidade e "
								+ efragil[i]);
					}

				}

				System.out.println("\n");

				break;
			case 3:
				loop = false;

				break;
			}
		}

		for (int i = 0; i < 10; i++) {

			if (identCaixa[i] != null) {

				System.out.println("Caixas cadastradas " + identCaixa[i] + " com " + largura[i] + " de largura, "
						+ altura[i] + " de altura, " + profundidade[i] + " de profundidade e " + efragil[i]);
			}

		}

	}
}