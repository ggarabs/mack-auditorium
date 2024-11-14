package services;

import java.util.Scanner;

import model.Espetaculo;
import model.Espetaculos;

public class CadastrarEspetaculo {
    public static void cadastrar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CADASTRO DE ESPETÁCULO ***");
        System.out.println("Nome do Espetáculo: ");
        String showName = sc.nextLine();

        System.out.println("Data: ");
        String dataString = sc.nextLine();

        System.out.println("Hora: ");
        String hourString = sc.nextLine();

        System.out.println("Preço da Entrada Inteira: ");
        double price = sc.nextDouble();

        // shows.adicionar(new Espetaculo(showName, dataString, hourString, price));
    }
}
