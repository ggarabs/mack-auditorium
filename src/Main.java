import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Integer initialOption = null;
        String initialMenuPath = "src/view/initial_menu.txt";

        try {
            do {
                Scanner menuSc = new Scanner(new File(initialMenuPath)), inputSc = new Scanner(System.in);
                StringBuilder content = new StringBuilder();
    
                while(menuSc.hasNextLine()) content.append(menuSc.nextLine()).append(System.lineSeparator());
                
                System.out.print(content.toString());
                System.out.print("Selecione uma opção: ");

                initialOption = inputSc.nextInt();

                System.out.println();
                
            } while (initialOption != 4);
        } catch (FileNotFoundException err) {
            System.out.println("Erro ao ler o arquivo: " + err);
        }
    }
}