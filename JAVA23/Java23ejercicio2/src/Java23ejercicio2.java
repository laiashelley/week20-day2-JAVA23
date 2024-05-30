// Alicia tiene sed y se encuentra una cantina bajo un árbol.

// El guarda de la cantina le pregunta si es Alicia. Si es que sí, entra.

// El barman le pregunta qué desea: si es diferente a una birra, entonces le dice que se vaya. Excepto si es una birra sin alcohol.

// Alicia quiere una birra sin alcohol. Pero tiene una condición: si el barman se pone a bailar, o el conejo blanco dice la hora correcta, en tres intentos o menos, entonces, se pedirá una birra con alcohol.

// Son las 20h.

// * Hacer un programa que determine si Alicia entra a la cantina o no, o bebe algo o no, y qué bebe dependiendo de cada caso.

// * Se trata principalmente de trabajar la lógica y el planteamiento. Ves paso por paso, no vayas a caerte por el agujero bajo el árbol.

import java.util.Scanner;

public class Java23ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Alicia tiene sed y encuentra una cantina debajo de un árbol.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Guardia: ¿Eres Alicia?");

        String fraseGuardia = sc.nextLine();

        if (fraseGuardia.equalsIgnoreCase("si")){
            beberCerveza();
        } else {
            System.out.println("OK, adiós y no vuelvas.");
        }

        sc.close();

    }

    public static void beberCerveza(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Barman: ¿Qué quieres de beber? 1-Cerbeza sin alcohol; 2-Agua; 3-CocaCola; 4-Cerveza con alcohol.");
        int respuestaBebida = sc.nextInt();

        switch (respuestaBebida){
            case 1:
                condicionesBeber();
            break;
            case 2:
                salirBucle();
            break;
            case 3:
                salirBucle();
            break;
            case 4:
                salirBucle();
            break;
            default:
                System.out.println("Debes introducir un número del 1 al 4.");
        }

        sc.close();

    }

    public static void salirBucle(){
        System.out.println("OK, adiós y no vuelvas.");
    }

    public static void condicionesBeber(){

        Scanner sc = new Scanner(System.in);

        System.out.println("De acuerdo, pero se tienen que cumplir dos cosas. El barman tiene que bailar y el conejo blanco debe adivinar que hora es ahora mismo.");

        System.out.println("Barman, ¿quieres bailar?");
        String respuestaBarman = sc.nextLine();
        System.out.println("Conejo Blanco, ¿que hora es?");
        int respuestaConejo = sc.nextInt();

        if (respuestaBarman.equalsIgnoreCase("si") && respuestaConejo == 8){
            System.out.println("¡Felicidades Alicia! ¡Aquí tienes tu cerveza sin alcohol!");
        } else {
            System.out.println("Lo siento, no tienes cerveza sin alcohol. No vuelvas más. Adiós.");
        }

        sc.close();
    }
}
