import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Churrasco {

    public static void main(String[] args) {
        int limiteCarne = 4;
        int limiteTulipa = 2;
        int limiteLinguiça = 2;
        int limiteFarofa = 1;
        int limiteRefrigerante = 5;

        int carneEscolhida = 0;
        int tulipaEscolhida = 0;
        int linguiçaEscolhida = 0;
        int farofaEscolhida = 0;
        int refrigeranteEscolhido = 0;

        List<String> participantes = new ArrayList<>();
        participantes.add("Amigo 1");
        participantes.add("Amigo 2");
        participantes.add("Amigo 3");
        participantes.add("Amigo 4");
        participantes.add("Amigo 5");
        participantes.add("Amigo 6");
        participantes.add("Amigo 7");

        Scanner scanner = new Scanner(System.in);

        for (String participante : participantes) {
            System.out.println("Opções disponíveis:");
            if (carneEscolhida < limiteCarne) {
                System.out.println("1. Carne bovina (500g) - Restante: " + (limiteCarne - carneEscolhida));
            }
            if (tulipaEscolhida < limiteTulipa) {
                System.out.println("2. Tulipa (500g) - Restante: " + (limiteTulipa - tulipaEscolhida));
            }
            if (linguiçaEscolhida < limiteLinguiça) {
                System.out.println("3. Linguiça de frango (500g) - Restante: " + (limiteLinguiça - linguiçaEscolhida));
            }
            if (farofaEscolhida < limiteFarofa) {
                System.out.println("4. Farofa (1kg) - Restante: " + (limiteFarofa - farofaEscolhida));
            }
            if (refrigeranteEscolhido < limiteRefrigerante) {
                System.out.println("5. Refrigerante (1 litro) - Restante: " + (limiteRefrigerante - refrigeranteEscolhido));
            }

            System.out.println("Escolha dois itens para levar:");
            int item1 = scanner.nextInt();
            int item2 = scanner.nextInt();

            while (!validarEscolhas(item1, item2, carneEscolhida, tulipaEscolhida, linguiçaEscolhida, farofaEscolhida, refrigeranteEscolhido)) {
                System.out.println("Escolhas inválidas. Escolha novamente:");
                item1 = scanner.nextInt();
                item2 = scanner.nextInt();
            }

            switch (item1) {
                case 1:
                    carneEscolhida++;
                    break;
                case 2:
                    tulipaEscolhida++;
                    break;
                case 3:
                    linguiçaEscolhida++;
                    break;
                case 4:
                    farofaEscolhida++;
                    break;
                case 5:
                    refrigeranteEscolhido++;
                    break;
            }

            switch (item2) {
                case 1:
                    carneEscolhida++;
                    break;
                case 2:
                    tulipaEscolhida++;
                    break;
                case 3:
                    linguiçaEscolhida++;
                    break;
                case 4:
                    farofaEscolhida++;
                    break;
                case 5:
                    refrigeranteEscolhido++;
                    break;
            }
        }

        System.out.println("\nItens escolhidos pelos participantes:");
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println(participantes.get(i) + ":");
            System.out.println("Carne bovina (500g): " + (i < carneEscolhida ? "Sim" : "Não"));
            System.out.println("Tulipa (500g): " + (i < tulipaEscolhida ? "Sim" : "Não"));
            System.out.println("Linguiça de frango (500g): " + (i < linguiçaEscolhida ? "Sim" : "Não"));
            System.out.println("Farofa (1kg): " + (i < farofaEscolhida ? "Sim" : "Não"));
            System.out.println("Refrigerante (1 litro): " + (i < refrigeranteEscolhido ? "Sim" : "Não"));
            System.out.println();
        }
    }

    private static boolean validarEscolhas(int item1, int item2, int carneEscolhida, int tulipaEscolhida, int linguiçaEscolhida, int farofaEscolhida, int refrigeranteEscolhido) {
        if ((item1 == 1 || item2 == 1) && carneEscolhida >= 2) {
            return false;
        }
        if ((item1 == 2 || item2 == 2) && tulipaEscolhida >= 2) {
            return false;
        }
        if ((item1 == 3 || item2 == 3) && linguiçaEscolhida >= 2) {
            return false;
        }
        if ((item1 == 4 || item2 == 4) && farofaEscolhida >= 1) {
            return false;
        }
        if ((item1 == 5 || item2 == 5) && refrigeranteEscolhido >= 5) {
            return false;
        }
        return true;
    }
}
