package com.medium.machadoah.cm.aplicacao;

import com.medium.machadoah.cm.modelo.*;
import com.medium.machadoah.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}

}
