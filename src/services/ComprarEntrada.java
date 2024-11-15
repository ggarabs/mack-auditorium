package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Cliente;
import model.Teatro;

public class ComprarEntrada {
    public static double comprar(Teatro mackTeatro){
        Scanner sc = new Scanner(System.in);

        mackTeatro.novaCompra();

        Integer showIndex = -1;
        boolean entradaValida = false;
        do {
            System.out.print("Selecione um espetáculo: ");

            try {
                showIndex = sc.nextInt();
                sc.nextLine();                   
            } catch (InputMismatchException err) {
                System.out.println("\nOpção inválida! Por favor, a entrada precisa ser numérica.");
                sc.nextLine();
            }
                
            if(showIndex >= 1 && showIndex <= mackTeatro.getEspetaculos().size()) entradaValida = true;
            else System.out.println("ERRO! Não existe espetáculo com essa numeração.\n");     
        } while (!entradaValida);

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

            Integer seatIndex;
            boolean assentoValido = false, assentoLivre = false;
            do {
                System.out.print("Selecione um assento: ");
                seatIndex = sc.nextInt();
                if(seatIndex >= 1 && seatIndex <= 50){
                    if(mackTeatro.getEspetaculoSelecionado().getAssentoLivre(seatIndex)) assentoLivre = true;
                    else System.out.println("Assento ocupado! Por favor escolha outro assento!\n");
                    assentoValido = true;
                }
                else System.out.println("Numeração incorreta!");
            } while (!assentoValido || !assentoLivre);

            System.out.print(content.toString());

            Integer priceIndex;
            boolean tipoValido = false;
            do {
                System.out.print("Selecione um tipo de entrada: ");
                priceIndex = sc.nextInt();
                if(priceIndex == 1 || priceIndex == 2 || priceIndex == 3) tipoValido = true;
                else System.out.println("Opção incorreta!");
            } while (!tipoValido);

            mackTeatro.novaEntrada(priceIndex, seatIndex);
            System.out.print("Deseja comprar uma outra entrada (S/N)? ");
            resp = sc.next();
        } while (!resp.equals("N"));

        boolean cpfValido = false, cpfEncontrado = false;
        String cpf, cpfRegex = "^\\d{11}$";
        do {
            System.out.print("Informe o CPF do Cliente Cadastrado: ");
            cpf = sc.next().trim();

            if(cpf.matches(cpfRegex)){
                cpfValido = true;
                for(Cliente aux : mackTeatro.getClientes()) if(cpf.equals(aux.getCpf())) cpfEncontrado = true;
                if(!cpfEncontrado) System.out.println("Cliente não encontrado na base de dados!\n");
            }
            else System.out.println("Formato inválido! Por favor, digite um CPF com 11 dígitos numéricos.\n");            
        } while (!cpfValido || !cpfEncontrado);

        double valorTotal = mackTeatro.finalizaCompra(cpf);

        System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotal));

        return valorTotal;
    }
}
