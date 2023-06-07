package primeiraclassejava.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import primeiraclassjava.constantes.StatusAluno;

//Está é uma Classe em java/Objeto.
public class Aluno {
	// TODO Auto-generated method stub

	// Esses são os atríbutos do aluno.

	private String nome;
	private String CPF;
	private String dataNascimento;
	private String idade;
	private String registroGeral;
	private String corDaPele;
	private String nomeMae;
	private String nomePai;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplina = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno() {
	}// cria os dados na memoria - Sendo padrão do java

	public Aluno(String nomePadrao) {

	}

	public String getCorDaPele() {
		return corDaPele;
	}

	public void setCorDaPele(String corDaPele) {
		this.corDaPele = corDaPele;
	}

	public Aluno(String nomePadrao, int idadePadrao) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaFinal() {

		double somarNotas = 0.0;

		for (Disciplina disciplina : disciplina) {
			somarNotas += disciplina.getNota();

		}

		return somarNotas / disciplina.size();

	}

	public boolean getalunoAprovado() {
		double media = this.getMediaFinal();
		if (media >= 70) {
			return true;
		} else {
			return false;

		}
	}

	public String getalunoAprovado2() {

		double media = this.getMediaFinal();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento + ", idade=" + idade
				+ ", registroGeral=" + registroGeral + ", corDaPele=" + corDaPele + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado
				+ ", disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, corDaPele, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, registroGeral,
				serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(corDaPele, other.corDaPele)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)

				&& Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

}
