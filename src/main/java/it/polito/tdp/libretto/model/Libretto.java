package it.polito.tdp.libretto.model;

import java.util.LinkedList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		super();
		this.voti = new LinkedList<Voto>();
	}
	/**
	 * Aggiungi un nuovo voto al libretto
	 *(per ora non fa nessun controllo)
	 * @param v Voto da aggiungere
	 * @return true
	 */
	
	public boolean add(Voto v) {
		
		return this.voti.add(v); // delega
	}
	
	public void stampa() {
		for(Voto v: this.voti) {
			System.out.println(v.toString());
		}
	}
	/**
	 * metodo generalizzato senza utilizzare costanti ( es. voto = 25)
	 * 
	 * @param valoreVoto
	 */
	public void stampaVotoParametro(int valoreVoto) {
		for(Voto v: this.voti) {
			if(v.getVotoOttenuto()==valoreVoto) {
				System.out.println(v.toString());
			}
		}
	}
	
	public Voto ricercaVotoPerNome(String corso) {
		
		for(Voto v: this.voti) {
			if(v.getNomeCorso().equals(corso)) {
				return v;
			}
		}
		return null;
		//throw new RuntimeException("Voto non trovato");
	}
	public boolean esisteVoto(Voto nuovo) {
		for(Voto v: this.voti) {
			if(v.getNomeCorso().equals(nuovo.getNomeCorso()) && v.getVotoOttenuto()==nuovo.getVotoOttenuto()) {
				return true;
			}
		}
		return false;
	}
}
