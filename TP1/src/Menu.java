import java.util.Scanner;

public class Menu extends AlunosRepository {

    public static void mostrarMenu() {
        System.out.println("Escolha uma das opções abaixo\n" +
                "----------------------------------\n" +
                "[1] Registrar as notas de um novo aluno.\n" +
                "[2] Consultar boletim de um aluno.\n" +
                "[3] Consultar notas da turma.\n" +
                "[4] Sair.\n" +
                "----------------------------------");
    }

    public static void escolherOpcao() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        int opcao = leitor.nextInt();

        while (opcao != 4) {
            if(opcao == 1) {

                System.out.println("Opção 1 selecionada. Registrar as notas de um novo aluno");
                System.out.println("Digite o nome do aluno: ");
                String nome = leitor.next();

                System.out.println("Digite a nota da primeira avaliação do aluno: ");
                double nota1 = leitor.nextDouble();
                System.out.println("Digite a nota da segunda avaliação do aluno: ");
                double nota2 = leitor.nextDouble();

                Aluno aluno = new Aluno(nome, nota1, nota2);

                if(posicao < alunos.length) {
                    alunos[posicao] = aluno;
                    System.out.println("O código de " + alunos[posicao].getNome() + " é " + posicao + "\n");
                    posicao = posicao + 1;
                } else {
                    System.out.println("Array cheio. Não é possível cadastrar mais alunos.");
                }

            } else if(opcao == 2) {
                System.out.println("Opção 2 selecionada. Consultar boletim de um aluno");
                System.out.println("Digite o código do aluno: ");
                int codigo = leitor.nextInt();

                System.out.println(alunos[codigo]);
                double media = (alunos[codigo].getAv1() + alunos[codigo].getAv2()) / 2;

                if (media < 4) {
                    System.out.println("Situação: Reprovado\n\n");
                } else if (media >= 4 && media < 7) {
                    System.out.println("Situação: Prova final\n\n");
                } else {
                    System.out.println("Situação: Aprovado\n\n");
                }
            } else if(opcao == 3) {
                for(int i = 0; i < alunos.length; i++) {
                    Aluno aluno = alunos[i];
                    if(aluno != null) {
                        System.out.println(alunos[i].toString());
                        double media = (alunos[i].getAv1() + alunos[i].getAv2()) / 2;
                        if (media < 4) {
                            System.out.println("Situação: Reprovado\n\n");
                        } else if (media >= 4 && media < 7) {
                            System.out.println("Situação: Prova final\n\n");
                        } else {
                            System.out.println("Situação: Aprovado\n\n");
                        }
                    }
                }
            } else {
                System.out.println("Opção nao conhecida.");
            }
            mostrarMenu();
            System.out.println("Digite a opção:");
            opcao = leitor.nextInt();
        }
        System.out.println("Opção 4 selecionada. Saindo do programa.");
    }
}
