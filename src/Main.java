import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Teatro;
import services.CadastrarCliente;
import services.CadastrarEspetaculo;
import services.ComprarEntrada;

public class Main{
    public static void main(String[] args) {
        Integer initialOption = null;
        String initialMenuPath = "view/initial_menu.txt";
        Teatro mackTheater = new Teatro();

        try {
            do {
                Scanner menuSc = new Scanner(new File(initialMenuPath)), inputSc = new Scanner(System.in);
                StringBuilder content = new StringBuilder();
    
                while(menuSc.hasNextLine()) content.append(menuSc.nextLine()).append(System.lineSeparator());
                
                System.out.print(content.toString());
                System.out.print("Selecione uma opção: ");

                initialOption = inputSc.nextInt();

                System.out.println();

                switch (initialOption) {
                    case 1:
                        CadastrarEspetaculo.cadastrar(mackTheater);
                        break;
                    case 2:
                        CadastrarCliente.cadastrar(mackTheater);
                        break;
                    case 3:
                        ComprarEntrada.comprar(mackTheater);
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }

                System.out.println();
            } while (initialOption != 4);
        } catch (FileNotFoundException err) {
            System.out.println("Erro ao ler o arquivo: " + err);
        }
    }
}