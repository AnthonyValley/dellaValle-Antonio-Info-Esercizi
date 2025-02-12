import java.util.Random;
import java.util.Scanner;

public class Eserizi_capitolo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Esercizio 1: Numeri sotto la media
        numeriSottoLaMedia(sc);

        // Esercizio 4: Frequenza carattere
        frequenzaCarattere(sc);

        // Esercizio 2: Conta famiglie
        contaFamiglie(sc);

        // Progetto 6: Verifica PIN
        verificaPin(sc);

        sc.close(); // Chiudi lo scanner
    }

    // Esercizio 1: Numeri sotto la media
    public static void numeriSottoLaMedia(Scanner sc) {
        int[] temperature = new int[10];
        int somma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Inserisci temperatura: ");
            temperature[i] = sc.nextInt();
            somma += temperature[i];
        }

        double media = somma / 10.0;
        int sottoMedia = 0;

        for (int temp : temperature) {
            if (temp < media) {
                sottoMedia++;
            }
        }

        System.out.println("Giorni sotto la media: " + sottoMedia);
    }

    // Esercizio 4: Frequenza carattere
    public static void frequenzaCarattere(Scanner sc) {
        int[] frequenza = new int[10];
        sc.nextLine(); // Consuma la nuova linea rimasta dalla lettura precedente

        System.out.print("Inserisci un numero telefonico: ");
        String numero = sc.nextLine();

        for (char c : numero.toCharArray()) {
            if (Character.isDigit(c)) {
                frequenza[c - '0']++;
            }
        }

        System.out.println("Frequenza delle cifre:");
        for (int i = 0; i < frequenza.length; i++) {
            System.out.println(i + ": " + frequenza[i]);
        }
    }

    // Esercizio 2: Conta famiglie
    public static void contaFamiglie(Scanner sc) {
        System.out.print("Inserisci numero di famiglie: ");
        int k = sc.nextInt();
        double[] redditi = new double[k];
        double massimo = 0;

        for (int i = 0; i < k; i++) {
            System.out.print("Inserisci reddito famiglia " + (i + 1) + ": ");
            redditi[i] = sc.nextDouble();
            if (redditi[i] > massimo) {
                massimo = redditi[i];
            }
        }

        int sottoDieciPercento = 0;
        for (double reddito : redditi) {
            if (reddito < massimo * 0.9) {
                sottoDieciPercento++;
            }
        }

        System.out.println("Famiglie sotto il 10% del massimo: " + sottoDieciPercento);
    }

    // Progetto 6: Verifica PIN
    public static void verificaPin(Scanner sc) {
        String pinVero = "12345";
        int[] numeriCasuali = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numeriCasuali[i] = random.nextInt(3) + 1;
        }

        System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
        System.out.print("NUM: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeriCasuali[i] + " ");
        }
        System.out.println();

        System.out.print("Inserisci il PIN (numeri casuali corrispondenti): ");
        String rispostaUtente = sc.nextLine();

        if (verificaRisposta(rispostaUtente, pinVero, numeriCasuali)) {
            System.out.println("Accesso consentito!");
        } else {
            System.out.println("Accesso negato! Risposta errata.");
        }
    }

    // Metodo per la verifica del PIN
    public static boolean verificaRisposta(String rispostaUtente, String pinVero, int[] numeriCasuali) {
        if (rispostaUtente.length() != pinVero.length()) {
            return false;
        }

        for (int i = 0; i < pinVero.length(); i++) {
            char cifraPin = pinVero.charAt(i);
            int cifraCasuale = numeriCasuali[Character.getNumericValue(cifraPin)];

            if (Character.getNumericValue(rispostaUtente.charAt(i)) != cifraCasuale) {
                return false;
            }
        }

        return true;
    }
}
