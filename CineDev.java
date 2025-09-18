import java.util.Scanner;

public class CineDev { 
    
    // matriz que representa a sala de cinema
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
        } while (opcao !=5);
    }

// assentos livres 'L'
    public static void inicializarSala() {
        for (int i = 0; i < salaDeCinema.length; i++){
            for (int j = 0; j < salaDeCinema.length; j++){
        salaDeCinema[i][j] = 'L';
        }
    }
}

// exibe o menu principal
    public static void exibirMenu(){
        System.out.println("\n===== Menu Principal =====");
        System.out.println("1. Exibir Mapa de Assentos");
        System.out.println("2. Comprar Ingresso");
        System.out.println("3. Cancelar Compra de Ingresso");
        System.out.println("4. Exibir Relatorio de Ocupação");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opção: ");
    }

// mapa da sala
    public static void exibirMapa(){
        System.out.println("\n Assentos: ");
        System.out.println("  ");
        for (int j = 0; j < 20; j++){
            System.out.printf("%2d ", j + 1);
    }
    System.out.println();
    
    for (int i = 0; i < salaDeCinema.length; i++){
        System.out.printf("Fileira %2d: ", i + 1);
        for (int j = 0; j < salaDeCinema.length; j++){
            System.out.print("[" + salaDeCinema[i][j]+ "]");
        }
        System.out.println();
    }
}
// compra do ingresso
    public static void comprarIngresso(){
    System.out.print("\nDigite o número da fileira (1 - 10): ");
        int fileira = scanner.nextInt();
    System.out.print("Digite o número do assento (1 - 20): ");
        int assento = scanner.nextInt();

    if (validarPosicao(fileira, assento)){
        if (salaDeCinema[fileira - 1][assento - 1] == 'L'){
            salaDeCinema[fileira - 1][assento - 1] = 'X';
            
            System.out.println("ingresso comprado com sucesso!");
        }else{
            System.out.println("este assento ja esta ocupado.");
        }
        }else{
        System.out.println("posicao invalida. tente novamente.");
    }
}
    public static void cancelaringresso(Scanner scanner){
        System.out.println("\nDigite o numero da fileira (1-10):");
        int fileira = scanner.nextInt();
         System.out.println("\nDigite o numero da assento (1-20):");
        int assento = scanner.nextInt();
        
        if (validarPosicao(fileira, assento)){
            if (salaDeCinema[fileira-1][assento-1]=='O'){
                if (salaDeCinema[fileira-1][assento-1]=='L')
                    System.out.println("compra cancelada com sucesso");
            } else {
                System.out.println("esse assento não foi comprado!");
                
            }
        }
    }
}

