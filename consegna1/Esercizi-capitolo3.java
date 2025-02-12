// Esercizi Capitolo 3

CScrivere un frammento di codice che verifichi che la variabile intera punteggio contenga un valore valido. Si supponga che i valori siano validi se sono compresi tra 0 e 100.

if (punteggio >= 0 && punteggio <= 100) {
    System.out.println("Valore valido");
} else {
    System.out.println("Valore non valido");
}

// Esercizio 2: Scrivere un frammento di codice che cambi il valore intero memorizzato nella variabile x nel seguente modo: se x è pari, deve essere diviso per 2; se è dispari deve essere moltiplicato per 3 e gli deve esser sottratto 1.

if (x % 2 == 0) {
    x /= 2;
} else {
    x = x * 3 - 1;
}



// Esercizio 3: Scrivere un programma che chieda all'utente di restituire una risposta di tipo sì/no. Si supponga che il programma legga la risposta dell'utente e la inserisca nella variabile String risposta.
// Se il valore di risposta è "sì" o "s", assegnare alla variabile accettato il valore true; altrimenti assegnare false.
// Come si può modificare il codice in modo che accetti anche i valori "Si" e "S"?

boolean accettato;
if (risposta.equalsIgnoreCase("sì") || risposta.equalsIgnoreCase("s")) {
    accettato = true;
} else {
    accettato = false;
}

//PROGETTO NUMERO 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero (x): ");
        int x = scanner.nextInt();

        System.out.print("Inserisci il secondo numero (y): ");
        int y = scanner.nextInt();

        if (x % y == 0) {
            System.out.println(x + " è divisibile per " + y);
        } else {
            System.out.println(x + " non è divisibile per " + y);
        }

        scanner.close();
    }
}