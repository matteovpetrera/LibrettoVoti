package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto lib = new Libretto();
		
		lib.add(new Voto("Analisi 1", 29, LocalDate.of(2021, 2, 15)));
		lib.add(new Voto("Fisica 2", 21, LocalDate.of(2021, 3, 12)));
		lib.add(new Voto("Informatica", 25, LocalDate.of(2022, 1, 21)));
		//metodo stampa
		lib.stampa();
		System.out.println();
		//lib.stampaVotoParametro(25);
		Voto v = lib.ricercaVotoPerNome("Analisi 1");
		System.out.println(v.toString());
		
		//
		Voto a1bis = new Voto("Analisi 1", 29, LocalDate.of(2025, 2, 25));
		Voto a1ter = new Voto("Analisi 1", 30, LocalDate.of(2025, 2, 25));
		/*
		 * il metodo compara sia il nome che il voto, quindi nel primo caso restituisce true
		 * nel secondo caso no in quanto i voti sono diversi
		 */
		System.out.println(a1bis.toString()+" è duplicato? "+ lib.esisteVoto(a1bis));
		System.out.println(a1ter.toString()+" è duplicato? "+ lib.esisteVoto(a1ter));
	}
	
}
