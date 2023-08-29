import ar.edu.unlu.poo.lista.ListaEnlazada;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(AnsiColor.BLUE +""+ AnsiColor.BOLD + "" + AnsiColor.DOUBLE_UNDERLINE + "Ejercicio 1: Lista enlazada simple" + AnsiColor.RESET);
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Hola");
        lista.agregar("Mundo");



        System.out.println(lista);
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("listo");
        try {
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();
            String sistemaOperativo = System.getProperty("os.name");
            ArrayList<String> comando= new ArrayList<>();
            if(sistemaOperativo.contains("Windows")){
                comando.add("cmd");
                comando.add("/C");
                comando.add("cls");

            } else {
                comando.add("clear");
            }

            ProcessBuilder pb = new ProcessBuilder(comando);
            Process iniciarProceso = pb.inheritIO().start();
            iniciarProceso.waitFor();

        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
}