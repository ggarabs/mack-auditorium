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

        String dataString, dataRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        boolean formatoValido = false;
        do {
            System.out.print("Data: ");
            dataString = sc.nextLine().trim();
            if(dataString.matches(dataRegex)) formatoValido = true;
            else System.out.println("Data em formato inválido! Por favor use o formato dd/mm/yyyy.\n");
        } while (!formatoValido);

        String horaString, horaRegex = "^([01]?[0-9]|2[0-3])h([0-5][0-9])$";
        formatoValido = false;
        do {
            System.out.print("Hora: ");
            horaString = sc.nextLine().trim();
            if(horaString.matches(horaRegex)) formatoValido = true;
            else System.out.println("Hora em formato inválido! Por favor use o formato HHhMM.\n");
        } while (!formatoValido);

        System.out.print("Preço da Entrada Inteira: ");
        double price = sc.nextDouble();

        mackTeatro.addEspetaculo(new Espetaculo(showName, dataString, horaString, price));
    }
}
