import java.util.Scanner;

public class Esercizi_capitolo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esercizio 1: Verifica del punteggio
        System.out.print("Inserisci un punteggio: ");
        int punteggio = scanner.nextInt();
        
        if (punteggio >= 0 && punteggio <= 100) {
            System.out.println("Valore valido");
        } else {
            System.out.println("Valore non valido");
        }

        // Esercizio 2: Modifica del valore di x
        System.out.print("Inserisci un numero (x): ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            x /= 2;
        } else {
            x = x * 3 - 1;
        }
        System.out.println("Nuovo valore di x: " + x);

        // Esercizio 3: Risposta sì/no
        scanner.nextLine(); // Consuma il newline rimasto nella scanner
        System.out.print("Inserisci una risposta (sì/no): ");
        String risposta = scanner.nextLine();

        boolean accettato = risposta.equalsIgnoreCase("sì") || risposta.equalsIgnoreCase("s") || 
                            risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("S");
        System.out.println("Accettato: " + accettato);

        // PROGETTO NUMERO 1: Verifica divisibilità
        System.out.print("Inserisci il primo numero (x): ");
        x = scanner.nextInt();

        System.out.print("Inserisci il secondo numero (y): ");
        int y = scanner.nextInt();

        if (y != 0 && x % y == 0) {
            System.out.println(x + " è divisibile per " + y);
        } else if (y != 0) {
            System.out.println(x + " non è divisibile per " + y);
        } else {
            System.out.println("Errore: divisione per zero non consentita.");
        }

        scanner.close();
    }
}
