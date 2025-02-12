import java.util.Scanner;

public class Eserizi_capitolo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Esercizio 3: Divisibilità
        divisibile(sc);

        // Esercizio 4: Verifica intervallo
        isInIntervallo(sc);

        // Esercizio 6: Trova carattere
        trovaCarattere(sc);

        // Progetto 4: Determinazione segno zodiacale
        determinaSegnoZodiacale(sc);

        sc.close(); // Chiudi lo scanner
    }

    // Esercizio 3: Divisibilità
    public static void divisibile(Scanner sc) {
        System.out.print("Inserisci il primo numero: ");
        int a = sc.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int b = sc.nextInt();
        
        if (b != 0 && a % b == 0) {
            System.out.println(a + " è divisibile per " + b);
        } else {
            System.out.println(a + " non è divisibile per " + b);
        }
    }

    // Esercizio 4: Verifica intervallo
    public static void isInIntervallo(Scanner sc) {
        System.out.print("Inserisci il valore minimo: ");
        int min = sc.nextInt();
        System.out.print("Inserisci il valore massimo: ");
        int max = sc.nextInt();
        System.out.print("Inserisci il valore da verificare: ");
        int valore = sc.nextInt();
        
        if (valore >= min && valore <= max) {
            System.out.println("Il valore " + valore + " è nell'intervallo.");
        } else {
            System.out.println("Il valore " + valore + " non è nell'intervallo.");
        }
    }

    // Esercizio 6: Trova carattere
    public static void trovaCarattere(Scanner sc) {
        sc.nextLine(); // Consuma la linea vuota
        System.out.print("Inserisci la prima stringa: ");
        String str1 = sc.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String str2 = sc.nextLine();

        boolean result;
        if (str1.length() == str2.length()) {
            result = str1.indexOf(str2.charAt(0)) >= 0;
        } else {
            result = str2.indexOf(str1.charAt(str1.length() - 1)) >= 0;
        }

        System.out.println("Risultato: " + result);
    }

    // Progetto 4: Determinazione segno zodiacale
    public static void determinaSegnoZodiacale(Scanner sc) {
        System.out.print("Inserisci il giorno di nascita: ");
        int giorno = sc.nextInt();
        System.out.print("Inserisci il mese di nascita: ");
        int mese = sc.nextInt();

        String segno = getSegnoZodiacale(giorno, mese);
        System.out.println("Il tuo segno zodiacale è: " + segno);
    }

    // Metodo per determinare il segno zodiacale
    public static String getSegnoZodiacale(int giorno, int mese) {
        if (mese < 1 || mese > 12 || giorno < 1 || giorno > 31) {
            return "Data non valida.";
        }

        if ((mese == 2 && giorno > 29) || (mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno > 30 || 
            (mese == 2 && giorno == 29 && !isLeapYear())) {
            return "Data non valida.";
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

    // Metodo per determinare se l'anno è bisestile
    public static boolean isLeapYear() {
        int year = 2025; 
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
