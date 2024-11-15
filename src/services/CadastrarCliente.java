package services;

import java.util.Scanner;

import model.Cliente;
import model.Teatro;

public class CadastrarCliente {
    public static void cadastrar(Teatro mackTeatro){
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CADASTRO DE CLIENTE ***");
        System.out.print("Nome do Cliente: ");
        String name = sc.nextLine();

        boolean formatoValido = false;
        String cpf, cpfRegex = "^\\d{11}$";
        do {
            System.out.print("CPF: ");
            cpf = sc.next().trim();
            if(cpf.matches(cpfRegex)) formatoValido = true;
            else System.out.println("Formato inválido! Por favor, digite um CPF com 11 dígitos numéricos.\n");            
        } while (!formatoValido);

        mackTeatro.addCliente(new Cliente(name, cpf));
    }
}
