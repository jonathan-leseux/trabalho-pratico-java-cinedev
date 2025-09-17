import java.util.Scanner;

public class CineDev { 
    //matriz que representa a sala de cinema 
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
// assentos livres 'L'
    public static void inicializarSala() {
        for (int i = 0; i < salaDeCinema.length; i++){
            for (int j = 0; j < salaDeCinema.length; j++){
        salaDeCinema[i][j] = 'L'
        }
    }
}

// exibe o menu principal
    public static void exibirMenu(){
    System.out.println("\n===== Menu Principal =====");
    System.out.println("1. Exibir Mapa de Assentos");
    System.out.println("2. Comprar Ingresso");
    System.out.println("3. Cancelar Compra de Ingresso");
    System.out.println("4.")
}
