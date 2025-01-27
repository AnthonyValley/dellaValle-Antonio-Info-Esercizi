// Esercizi Capitolo 5

// Esercizio 3: Si realizzi una classe Java che abbia definito un metodo chiamato divisibile che accetta in ingresso due interi e restituisce true se il primo intero è divisibile per il secondo, false in caso contrario.
public boolean divisibile(int a, int b) {
    return b != 0 && a % b == 0;
}

// Esercizio 4: Si realizzi una classe Java che abbia definito un metodo che accetta in ingresso 3 interi min, max e valore. Tale metodo deve verificare se valore è all'interno dell'intervallo min - max estremi inclusi. Se è all'interno, il metodo restituisce true; in caso contrario false.
public boolean isInIntervallo(int min, int max, int valore) {
    return valore >= min && valore <= max;
}

// Esercizio 6: Si realizzi una classe Java che definisce: 
// a. Il metodo con nome trova che accetta in ingresso una stringa e un carattere e restituisce true se il carattere è presente almeno una volta nella stringa; 
// b. Il metodo main che legge in input due stringhe inserite dall'utente. Se le due stringhe hanno la stessa lunghezza, invoca il metodo trova passandogli la prima stringa e il primo carattere della seconda; se hanno lunghezza diversa, invoca il metodo trova passando la seconda stringa e l'ultimo carattere della prima stringa. Stampa a video il risultato dell'invocazione del metodo.
public class TrovaCarattere {
    public static boolean trova(String str, char c) {
        return str.indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci prima stringa: ");
        String str1 = sc.nextLine();
        System.out.print("Inserisci seconda stringa: ");
        String str2 = sc.nextLine();

        boolean result;
        if (str1.length() == str2.length()) {
            result = trova(str1, str2.charAt(0));
        } else {
            result = trova(str2, str1.charAt(str1.length() - 1));
        }

        System.out.println("Risultato: " + result);
    }
}

// PROGETTO NUMERO 4
import java.util.Scanner;

public class Main {
    
    public static String determinaSegnoZodiacale(int giorno, int mese) {
    
        if (mese < 1 || mese > 12 || giorno < 1 || giorno > 31) {
            System.out.println("Data non valida.");
            System.exit(1); 
        }

        if ((mese == 2 && giorno > 29) || (mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno > 30 || (mese == 2 && giorno == 29 && !isLeapYear())) {
            System.out.println("Data non valida.");
            System.exit(1); 
        }

        if ((mese == 3 && giorno >= 21) || (mese == 4 && giorno <= 20)) return "Ariete";
        if ((mese == 4 && giorno >= 21) || (mese == 5 && giorno <= 20)) return "Toro";
        if ((mese == 5 && giorno >= 21) || (mese == 6 && giorno <= 21)) return "Gemelli";
        if ((mese == 6 && giorno >= 22) || (mese == 7 && giorno <= 22)) return "Cancro";
        if ((mese == 7 && giorno >= 23) || (mese == 8 && giorno <= 23)) return "Leone";
        if ((mese == 8 && giorno >= 24) || (mese == 9 && giorno <= 22)) return "Vergine";
        if ((mese == 9 && giorno >= 23) || (mese == 10 && giorno <= 22)) return "Bilancia";
        if ((mese == 10 && giorno >= 23) || (mese == 11 && giorno <= 22)) return "Scorpione";
        if ((mese == 11 && giorno >= 23) || (mese == 12 && giorno <= 21)) return "Sagittario";
        if ((mese == 12 && giorno >= 22) || (mese == 1 && giorno <= 20)) return "Capricorno";
        if ((mese == 1 && giorno >= 21) || (mese == 2 && giorno <= 19)) return "Acquario";
        return "Pesci"; 
    }

    public static boolean isLeapYear() {
        int year = 2025; 
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il giorno di nascita: ");
        int giorno = scanner.nextInt();
        
        System.out.print("Inserisci il mese di nascita: ");
        int mese = scanner.nextInt();

        String segno = determinaSegnoZodiacale(giorno, mese);
        
        System.out.println("Il tuo segno zodiacale è: " + segno);
        
        scanner.close();
    }
}
