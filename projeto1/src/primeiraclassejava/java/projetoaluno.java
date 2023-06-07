
package primeiraclassejava.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JOptionPane;

import primeiraclassjava.constantes.StatusAluno;

@SuppressWarnings("unused")
public class projetoaluno {
	// Main é um metodo auto executavél em java

	public static void main(String[] args) {

		String longin = JOptionPane.showInputDialog("infome o login");
		String senha = JOptionPane.showInputDialog("informe a senha");

		if (longin.equalsIgnoreCase("adm") && senha.equalsIgnoreCase(senha)) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 4; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual é o nome do Aluno ? " + qtd + "");

				String idade = JOptionPane.showInputDialog("Qual é a idade do Aluno ?");
				String cpf = JOptionPane.showInputDialog("Qual é o cpf do Aluno ?");
				String dataNascimento = JOptionPane.showInputDialog("Qual é a data de Nascimento do aluno do Aluno ?");
				String registroGeral = JOptionPane.showInputDialog("Qual é o Registro Geral do Aluno ?");
				String cordaPele = JOptionPane.showInputDialog("Qual é a cor da Pele do Aluno ?");
				String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe do Aluno ?");
				String nomePai = JOptionPane.showInputDialog("Qual é o nome do pai do Aluno ?");
				String escola = JOptionPane.showInputDialog("Qual é a Escola que o estuda do Aluno ?");
				String serie = JOptionPane.showInputDialog("Qual é a Seríe que o Aluno Está ?");

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);

				aluno1.setCPF(cpf);
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setIdade(idade);
				aluno1.setRegistroGeral(registroGeral);
				aluno1.setCorDaPele(cordaPele);
				aluno1.setNomeMae(nomeMae);
				aluno1.setNomePai(nomePai);
				aluno1.setNomeEscola(escola);
				aluno1.setSerieMatriculado(serie);

				for (int pos = 1; pos <= 1; ++pos) {
					String nomeDisciplina = JOptionPane.showInputDialog("Qual é a disciplina" + pos + " ?");
					String nomeNota = JOptionPane.showInputDialog("Qual é o valor da Nota " + pos + "?");

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

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getalunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {

						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getalunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);

					}
					if (aluno.getalunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);

					}
				}

				System.out.println("------------Aprovado-----------------");

				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getalunoAprovado2() + " com media de = " + aluno.getMediaFinal());

				}

				System.out.println("---------------Reprovado----------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO))
					System.out.println(
							"Resultado = " + aluno.getalunoAprovado2() + " com media de = " + aluno.getMediaFinal());

				System.out.println("---------------Recuperação----------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO))
					System.out.println(
							"Resultado = " + aluno.getalunoAprovado2() + " com media de = " + aluno.getMediaFinal());

			}
		}
	}

}
