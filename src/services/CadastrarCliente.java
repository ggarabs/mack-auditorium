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

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        mackTeatro.addCliente(new Cliente(name, cpf));
    }
}
