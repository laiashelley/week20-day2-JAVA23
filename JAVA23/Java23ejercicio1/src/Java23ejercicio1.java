// Hemos entrado en guerra con Corea del Norte y necesitamos codificar nuestros mensajes para evitar que nuestros planes sean interceptados.
// Te han encargado el siguiente programa para salvar el mundo:

// Realiza dos métodos: CODIFICAR y DESCODIFICAR

// - CODIFICAR: introduce el mensaje a enviar. Como resultado, en pantalla
// solo veremos una transformación de cualquier tipo que pueda mostrar la terminal:
// pasar a números ASCII,  cambiar una letra por otra, etc.

// - DESCODIFICAR: la persona que recibe el mensaje posee el programa para descodificarlo.

// Se precisa de una clave traductora que conocen ambas partes.

// Puedes simplificarlo o complicarlo tanto como quieras mientras funcione.

import java.util.ArrayList;
import java.util.Scanner;

public class Java23ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        mensajeInicial();
        ArrayList <Integer> resultadoCodificado = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String fraseUsuario = sc.nextLine();
    

        codificar(fraseUsuario, resultadoCodificado);

        System.out.println(resultadoCodificado);

        mensajeRecibido();
        
        descodificar(resultadoCodificado);

       sc.close();
    }

    public static void mensajeInicial(){

        System.out.println("Introduce el mensaje que quieres enviar. Corea del Norte nos está escuchando. Por favor, se especifico con el mensaje que quieres enviar. Gracias.");
        
    }

    public static void codificar(String fraseUsuario, ArrayList <Integer> resultadoCodificado){

        for (int i=0; i<fraseUsuario.length(); i++){
            char caracter = fraseUsuario.charAt(i);
            int ASCII = (int) caracter;
            resultadoCodificado.add(ASCII); 
        }

        System.out.println("Tu mensaje es el siguiente: " + resultadoCodificado);
        
    }

    public static void mensajeRecibido(){

        System.out.println("Te acaba de llegar el mensaje. Aquí tienes este mensaje descodificado: ");

    }
   
    public static void descodificar(ArrayList <Integer> resultadoCodificado){

        String mensajeDescodificado = "";

        for (int codigo : resultadoCodificado){
            char caracter = (char) codigo;
            mensajeDescodificado += caracter;
        }

        System.out.println("Tu mensaje es el siguiente: " + mensajeDescodificado);

    }

}
