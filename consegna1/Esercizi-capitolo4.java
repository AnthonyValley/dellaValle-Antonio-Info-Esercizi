// Esercizi Capitolo 4

// Esercizio 1: Si scriva un frammento di codice che legge le parole digitate sulla tastiera finché non viene digitata la parola fine. Per ciascuna parola (tranne la parola fine) si riporti se il primo carattere è uguale all'ultimo. Per implementare il ciclo richiesto si utilizzino i seguenti costrutti:
// a. l'istruzione while;
// b. l'istruzione do-while

Scanner sc = new Scanner(System.in);
String parola;
System.out.println("Digita le parole (digita 'fine' per terminare):");
parola = sc.nextLine();
while (!parola.equals("fine")) {
    System.out.println("Primo e ultimo carattere uguali: " + (parola.charAt(0) == parola.charAt(parola.length() - 1)));
    parola = sc.nextLine();
}
//Con do-while:
Scanner sc = new Scanner(System.in);
String parola;
do {
    System.out.println("Digita una parola (digita 'fine' per terminare):");
    parola = sc.nextLine();
    if (!parola.equals("fine")) {
        System.out.println("Primo e ultimo carattere uguali: " + (parola.charAt(0) == parola.charAt(parola.length() - 1)));
    }
} while (!parola.equals("fine"));

// Esercizio 4: Si scriva un frammento di codice che computi la somma dei primi n numeri interi positivi dispari. Per esempio, se n fosse uguale a 9, il programma dovrebbe calcolare 1 + 3 + 5 + 7 + 9.

int somma = 0;
int dispari = 1;
for (int i = 0; i < n; i++) {
    somma += dispari;
    dispari += 2;
}
System.out.println("Somma: " + somma);

// Esercizio 8: Si scriva un ciclo che conti il numero di caratteri di spaziatura in una stringa data.

int spazi = 0;
for (char c : stringa.toCharArray()) {
    if (Character.isWhitespace(c)) {
        spazi++;
    }
}
System.out.println("Numero di spazi: " + spazi);

// PROGETTO NUMERO 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ottimi = 0, distinti = 0, buoni = 0, discreti = 0, sufficienti = 0, insufficienti = 0;
        int voto;
        int totaleVoti = 0;

        while (totaleVoti < 10) {
            System.out.print("Inserisci un voto: ");
            voto = scanner.nextInt();

            if (voto < 0) {
                System.out.println("Errore: è impossibile prendere un voto negativo.");
                break;
            }

            totaleVoti++;

            if (voto >= 29 && voto <= 30) {
                ottimi++;
            } else if (voto >= 26 && voto <= 28) {
                distinti++;
            } else if (voto >= 23 && voto <= 25) {
                buoni++;
            } else if (voto >= 20 && voto <= 22) {
                discreti++;
            } else if (voto >= 18 && voto <= 19) {
                sufficienti++;
            } else if (voto >= 0 && voto <= 17) {
                insufficienti++;
            }
        }

        if (totaleVoti > 0) {
            System.out.println("Numero totale di voti: " + totaleVoti);
            System.out.println("Numero di ottimi: " + ottimi);
            System.out.println("Numero di distinti: " + distinti);
            System.out.println("Numero di buoni: " + buoni);
            System.out.println("Numero di discreti: " + discreti);
            System.out.println("Numero di sufficienti: " + sufficienti);
            System.out.println("Numero di insufficienti: " + insufficienti);
        } else {
            System.out.println("Nessun voto valido inserito.");
        }

        scanner.close();
    }
}