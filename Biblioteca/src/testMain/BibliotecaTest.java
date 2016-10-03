package testMain;
import java.text.ParseException;

import biblioteca.*;

public class BibliotecaTest {

	public static void main(String[] args) throws ParseException {
		
		Gestione g = new Gestione();
		Biblioteca b = new Biblioteca("biblio");
		
		System.out.println("Registrazione Libri:");
		
		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "a", 4));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "b", 10));
		System.out.println("Copie totali: "+g.registraLibro(b, "NNNN", "aaaa", "c", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "FFFF", "aaaa", "f", 1));
		
		System.out.println("Registrazione Utenti:");
		
		if(g.registraUtente(b, "Mario", "Rossi")==true){
			System.out.println("Utente Registrato");
		}else{
			System.out.println("Utente già Registrato");}
		if(g.registraUtente(b, "Mario", "Rossi")==true){
			System.out.println("Utente Registrato");
		}else{
			System.out.println("Utente già Registrato");}
		if(g.registraUtente(b, "Chiara", "Verdi")==true){
			System.out.println("Utente Registrato");
		}else{
			System.out.println("Utente già Registrato");}
		
		System.out.println("Prestito Libri: ");
		
		if(g.prestaLibro(b, "tttt", "aaaa", "Mario", "Rossi", "23-03-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "TTTT", "AAAA", "Mario", "Rossi", "23-04-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "NNNN", "aaaa", "Mario", "Rossi", "23-05-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "FFFF", "aaaa", "Mario", "Rossi", "23-05-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "NNNN", "aaaa", "Chiara", "Verdi", "23-06-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "FFFF", "aaaa", "Chiara", "Verdi", "23-06-2016")==true){
			System.out.println("Libro prestato!");
		}else{
			System.out.println("Impossibile prestare!");}
		
		System.out.println("Resituzione libri: ");
		
		if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi", "23-09-2016")==true){
			System.out.println("Libro restituito!");
		}else{
			System.out.println("Impossibile restituire!");}
		if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi", "23-09-2016")==true){
			System.out.println("Libro restituito!");
		}else{
			System.out.println("Impossibile restituire!");}	
	}
}
