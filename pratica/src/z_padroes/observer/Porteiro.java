package z_padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	// Subject
	
	private List<ObservadorChegadaAniversarinate> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversarinate observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner input = new Scanner(System.in);

		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.print("Aniversariante chegou? ");
			valor = input.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				// Criar evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				// notificar observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}

		input.close();
	}

}
