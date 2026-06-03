import java.util.Random;
import java.util.Scanner;

public class BatalhaDev {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int devHP = 100;
        int bugHP = 120;

        System.out.println("=======================================================");
        System.out.println("⚔️  BATALHA ÉPICA: ENGENHEIRO DE SOFTWARE vs BUG EM PROD ⚔️");
        System.out.println("=======================================================\n");
        Thread.sleep(1000);
        System.out.println("Um Bug Crítico selvagem apareceu na sexta-feira às 17h50!");
        System.out.println("O sistema precisa ser entregue e o cliente está ligando...\n");

        while (devHP > 0 && bugHP > 0) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Seu HP: " + devHP + " ❤️   |   HP do Bug: " + bugHP + " 🐛");
            System.out.println("Escolha sua ação de mitigação:");
            System.out.println("1. Refatorar usando Arquitetura C4 (Ataque Seguro e Estruturado)");
            System.out.println("2. Fazer uma gambiarra usando ponteiros e matrizes em C (Ataque Forte, mas muito arriscado)");
            System.out.println("3. Tomar um café expresso duplo (Curar HP)");
            System.out.print("> Sua escolha: ");

            String escolha = scanner.nextLine();
            System.out.println();

            // Turno do Desenvolvedor
            if (escolha.equals("1")) {
                int dano = rand.nextInt(15) + 10;
                bugHP -= dano;
                System.out.println("Você abriu o Draw.io e mapeou os containers perfeitamente! Causou " + dano + " de dano estrutural ao Bug.");
            } else if (escolha.equals("2")) {
                if (rand.nextBoolean()) {
                    int dano = rand.nextInt(35) + 20;
                    bugHP -= dano;
                    System.out.println("A matriz rodou lisa! A lógica funcionou magicamente e obliterou o Bug com " + dano + " de dano.");
                } else {
                    System.out.println("Segmentation Fault (core dumped)! A gambiarra falhou miseravelmente e você perdeu seu turno.");
                }
            } else if (escolha.equals("3")) {
                int cura = rand.nextInt(20) + 15;
                devHP += cura;
                System.out.println("A cafeína bateu no cérebro. Você recuperou " + cura + " de HP!");
            } else {
                System.out.println("Comando inválido no terminal. O desespero te fez errar o teclado e você perdeu a vez!");
            }

            Thread.sleep(1500);

            // Verifica se o bug foi derrotado antes dele atacar
            if (bugHP <= 0) break;

            // Turno do Bug
            System.out.println("\nTurno do Bug...");
            Thread.sleep(1000);

            int acaoBug = rand.nextInt(3);
            if (acaoBug == 0) {
                int dano = rand.nextInt(15) + 5;
                devHP -= dano;
                System.out.println("O Bug violou três Heurísticas de Nielsen de uma vez, arruinando a interface! Você sofreu " + dano + " de dano de usabilidade.");
            } else if (acaoBug == 1) {
                int dano = rand.nextInt(25) + 10;
                devHP -= dano;
                System.out.println("NullPointerException inesperado bem no meio do fluxo principal! Dano crítico de " + dano + "!");
            } else {
                System.out.println("O Bug tentou causar um memory leak, mas o Garbage Collector do Java te salvou desta vez. Nenhum dano.");
            }
            Thread.sleep(1500);
        }

        // Resolução do Conflito
        System.out.println("\n=======================================================");
        if (devHP > 0) {
            System.out.println("🏆 VITÓRIA! Você conteve o erro, fez o commit e salvou o fim de semana!");
        } else {
            System.out.println("💀 GAME OVER. O Bug tomou conta do servidor. Prepare-se para explicar o atraso na Daily de segunda-feira...");
        }
        System.out.println("=======================================================");
        
        scanner.close();
    }
}