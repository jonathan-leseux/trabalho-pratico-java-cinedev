import java.util.Scanner;

public class CineDev { 
    static char [][] salaDeCinema = new char [10][20];
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        inicializarSala();

        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    exibirMapa();
                    break;
    }
}
