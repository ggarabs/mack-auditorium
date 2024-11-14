package services;

import java.util.Scanner;

import model.Espetaculo;
import model.Teatro;

public class CadastrarEspetaculo {
    public static void cadastrar(Teatro mackTeatro){
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CADASTRO DE ESPETÁCULO ***");
        System.out.print("Nome do Espetáculo: ");
        String showName = sc.nextLine();

        System.out.print("Data: ");
        String dataString = sc.nextLine();

        System.out.print("Hora: ");
        String hourString = sc.nextLine();

        System.out.print("Preço da Entrada Inteira: ");
        double price = sc.nextDouble();

        mackTeatro.addEspetaculo(new Espetaculo(showName, dataString, hourString, price));
    }
}
