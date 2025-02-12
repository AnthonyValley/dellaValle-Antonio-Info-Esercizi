import java.util.Scanner;

public class Esercizi_capitolo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Esercizio 1: Verifica se il primo e l'ultimo carattere sono uguali
        String parola;
        
        // Chiedi 3 volte all'utente di inserire una parola
        for (int i = 0; i < 3; i++) {
            System.out.println("Digita una parola (digita 'fine' per terminare):");
            parola = sc.nextLine();
            if (parola.equalsIgnoreCase("fine")) {
                break; // Se l'utente digita 'fine', interrompe il ciclo
            }
            System.out.println("Primo e ultimo carattere uguali: " + (parola.charAt(0) == parola.charAt(parola.length() - 1)));
        }

        // Esercizio 4: Somma dei primi n numeri dispari
        System.out.print("Inserisci n: ");
        int n = sc.nextInt();
        int somma = 0;
        int dispari = 1;
        for (int i = 0; i < n; i++) {
            somma += dispari;
            dispari += 2;
        }
        System.out.println("Somma: " + somma);

        // Esercizio 8: Conta gli spazi in una stringa
        sc.nextLine(); // Consuma il newline rimasto nel buffer
        System.out.print("Inserisci una stringa: ");
        String stringa = sc.nextLine();
        int spazi = 0;
        for (char c : stringa.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spazi++;
            }
        }
        System.out.println("Numero di spazi: " + spazi);

        // PROGETTO NUMERO 5: Statistiche sui voti
        int ottimi = 0, distinti = 0, buoni = 0, discreti = 0, sufficienti = 0, insufficienti = 0;
        int voto;
        int totaleVoti = 0;

        while (totaleVoti < 10) {
            System.out.print("Inserisci un voto: ");
            voto = sc.nextInt();

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

        sc.close();
    }
}
