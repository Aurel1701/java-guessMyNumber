package numeroRandom;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)      {          
		// Scrivere un programma che genera un numero casuale (senza visualizzarlo) e chiede all'utente di indovinarlo.
		// Dopo ogni tentativo dell'utente il programma deve indicare se il numero generato è maggiore o minore di quello inserito dall'utente.
		// Il programma termina quando l'utente indovina, nel qual caso mostra anche il numero di tentativi effettuati 
		
		
		Random r = new Random();
		int count = 1;
		
		int numeroCasuale = r.nextInt(6);
		System.out.println(numeroCasuale);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Indovina il numero generato");
        
        int user = in.nextInt();
        while(numeroCasuale != user ){
        	if(numeroCasuale < user)
        		System.out.println("il numero scritto è maggiore di quello generato");
        	else
        		System.out.println("il numero scritto è minore di quello generato");
        	System.out.println("risposta utente=");
            user = in.nextInt();
        	count++;
        	
        	
        }System.out.println("il numero è corretto, hai effettuato :" + count + "tentativi");
        }

        		
	}
