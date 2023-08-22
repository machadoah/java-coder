package com.medium.machadoah.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import com.medium.machadoah.cm.excecao.ExplosaoException;

public class Campo {
	// Um quadradinho do tabuleiro

	private final int linha;
	private final int coluna;

	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;

	private List<Campo> vizinhos = new ArrayList<>();

	public Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	boolean adicionarVizinho(Campo vizinho) {

		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;

		if (deltaGeral == 1 && diagonal == false) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal == true) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}

	}

	void alternarMarcacao() {
		if (aberto == false) {
			marcado = !marcado;
		}
	}

	boolean abrir() {

		if (aberto == false && marcado == false) {
			aberto = true;

			if (minado == true) {
				throw new ExplosaoException();
			}

			if (vizinhancaSegura()) {

				vizinhos.forEach(v -> v.abrir());
			}

			return true;
		} else {

			return false;
		}

	}

	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado == true);
	}

	void minar() {
		if (minado == false) {
			minado = true;
		}
	}

	public boolean isMinado() {
		return minado;
	}

	public boolean isMarcado() {
		return marcado;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	boolean objetivoAlcancado() {
		boolean desvendado = (minado == false) && (aberto == true);
		boolean protegido = (minado == true) && (marcado == true);

		return desvendado || protegido;
	}

	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado == true).count();
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;

	}

	@Override
	public String toString() {
		if (marcado == true) {
			return "x";
		} else if (aberto == true && minado == true) {
			return "*";
		} else if (aberto == true && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if (aberto == true) {
			return " ";
		} else {
			return "?";
		}
	}

}
