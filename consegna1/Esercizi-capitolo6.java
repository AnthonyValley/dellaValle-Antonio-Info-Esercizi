// Esercizi Capitolo 6

// Esercizio 1: Scrivere un programma in una classe NumeriSottoLaMedia che conti il numero di giorni in cui la temperatura è al di sotto della media. Leggere 10 temperature da tastiera e memorizzarle in un array. Calcolare la temperatura media e contare e visualizzare il numero di giorni in cui la temperatura è al di sotto della media.
int[] temperature = new int[10];
int somma = 0;
Scanner sc = new Scanner(System.in);

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

// Esercizio 4: Scrivere un programma in una classe FrequenzaCarattere che conti il numero di volte che una cifra appare in un numero telefonico. Il programma deve creare un array di dimensione 10 che memorizzerà il conto di ogni cifra da 0 a 9. Leggere da tastiera un numero di telefono come stringa. Esaminare ogni carattere del numero telefonico e incrementare il conteggio relativo alla cifra nell'array. Visualizzare il contenuto dell'array.
int[] frequenza = new int[10];
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

// Esercizio 2: Scrivere un programma in una classe ContaFamiglie che conti il numero di famiglie il cui reddito è al di sotto di un certo valore. Leggere un intero k da tastiera e, in seguito, creare un array di valori double di dimensione k. Leggere dalla tastiera k valori che rappresentano i redditi delle famiglie e memorizzarli nell'array. Trovare il più elevato tra questi redditi. Poi contare le famiglie il cui reddito è inferiore fino al 10% rispetto al reddito massimo. Visualizzare questo conteggio e i redditi di queste famiglie.
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

//PROGETTO NUMERO 6
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il PIN (numeri casuali corrispondenti): ");
        String rispostaUtente = scanner.nextLine();

        if (verificaRisposta(rispostaUtente, pinVero, numeriCasuali)) {
            System.out.println("Accesso consentito!");
        } else {
            System.out.println("Accesso negato! Risposta errata.");
        }

        scanner.close();
    }

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

