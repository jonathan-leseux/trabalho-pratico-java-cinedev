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
                case 2:
                    comprarIngresso();
                    break;
                case 3:
                    cancelarIngresso();
                    break;
                case 4:
                    exibirRelatorio();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao !=5)
    }
}

    public static void inicializarSala() {
    for (int i = 0; i < salaDeCinema.length; j++){
        salaDeCinema[i][j] = 'L'
}
}

