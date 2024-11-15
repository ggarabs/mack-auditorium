package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Teatro;

public class ComprarEntrada {
    public static double comprar(Teatro mackTeatro){
        Scanner sc = new Scanner(System.in);

        mackTeatro.novaCompra();

        System.out.print("Selecione um espetáculo: ");

        Integer showIndex = sc.nextInt();

        mackTeatro.selecionaEspetaculo(showIndex);

        StringBuilder content = new StringBuilder();

        try {
            Scanner seatsTypesSc = new Scanner(new File("src/view/seats_types.txt"));
            while(seatsTypesSc.hasNextLine()) content.append(seatsTypesSc.nextLine()).append(System.lineSeparator());
        } catch (FileNotFoundException err) {
            System.out.println("Falhou!! " + err);
        }

        String resp;
        do {
            System.out.print("Selecione um assento: ");

            Integer seatIndex = sc.nextInt();

            System.out.print(content.toString());

            System.out.print("Selecione um tipo de entrada: ");

            Integer priceIndex = sc.nextInt();

            mackTeatro.novaEntrada(priceIndex, seatIndex);
            System.out.print("Deseja comprar uma outra entrada (S/N)? ");
            resp = sc.next();
        } while (!resp.equals("N"));

        System.out.print("Informe o CPF do Cliente Cadastrado: ");

        String cpf = sc.next();

        double valorTotal = mackTeatro.finalizaCompra(cpf);

        System.out.println("Valor Total: R$ " + valorTotal);

        return valorTotal;
    }
}
