
package primeiraclassejava.java;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class projetoaluno {
	// Main é um metodo auto executavél em java
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual é o nome do Aluno ? " + qtd + "");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual é a idade do Aluno ?");
			 * String cpf = JOptionPane.showInputDialog("Qual é o cpf do Aluno ?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual é a data de Nascimento do aluno do Aluno ?"
			 * ); String registroGeral =
			 * JOptionPane.showInputDialog("Qual é o Registro Geral do Aluno ?"); String
			 * cordaPele = JOptionPane.showInputDialog("Qual é a cor da Pele do Aluno ?");
			 * String nomeMae =
			 * JOptionPane.showInputDialog("Qual é o nome da mãe do Aluno ?"); String
			 * nomePai = JOptionPane.showInputDialog("Qual é o nome do pai do Aluno ?");
			 * String escola =
			 * JOptionPane.showInputDialog("Qual é a Escola que o estuda do Aluno ?");
			 * String serie =
			 * JOptionPane.showInputDialog("Qual é a Seríe que o Aluno Está ?");
			 */

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			 * aluno1.setCPF(cpf); aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setIdade(idade); aluno1.setRegistroGeral(registroGeral);
			 * aluno1.setCorDaPele(cordaPele); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setNomeEscola(escola);
			 * aluno1.setSerieMatriculado(serie);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual é a disciplina" + pos + " ?");
				String nomeNota = JOptionPane.showInputDialog("Qual é o valor da Nota ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(nomeNota));

				aluno1.getDisciplina().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma materia ?");

			if (escolha == 0) {

				int continuarremover = 0;
				int posicao = 1;

				while (continuarremover == 0) {

					String removerDisciplina = JOptionPane.showInputDialog("Qual Disciplina 1,2,3 ou 4? ");
					aluno1.getDisciplina().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					++posicao;
					continuarremover = JOptionPane.showConfirmDialog(null, "Dejesa continuar removendo");
				}
			}

			alunos.add(aluno1);

		}
		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Anderson")) {
				alunos.remove(aluno);
				break;
			} else {

				System.out.println(aluno);
				System.out.println("media final do ALUNO é: " + aluno.getMediaFinal());
				System.out.println("Resultado : " + aluno.getalunoAprovado2());

				System.out.println("------------------------------------------------");
			}

		}
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são");

			for (Disciplina disciplina : aluno.getDisciplina()) {
				System.out.println(disciplina.getDisciplina());
			}
		}

		/*
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Anderson");
		 * aluno2.setCPF("1234");
		 * 
		 * 
		 * Aluno aluno3 = new Aluno(); aluno3.setNome("Anderson");
		 * aluno3.setCPF("1235");
		 * 
		 * if(aluno2.equals(aluno3)) { System.out.println("Os alunos são iguais"); }else
		 * { System.out.println("Os alunos não são iguais"); }
		 */

	}
}
