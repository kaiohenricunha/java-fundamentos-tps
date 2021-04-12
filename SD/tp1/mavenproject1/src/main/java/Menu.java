import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);
    AlunosRepository alunosRepository = new AlunosRepository();
    
    public static void showMenu() {
        System.out.println("Escolha uma das opções abaixo\n" +
                "----------------------------------\n" +
                "[1] Registrar as notas de um novo aluno.\n" +
                "[2] Consultar boletim de um aluno.\n" +
                "[3] Consultar notas da turma.\n" +
                "[4] Sair.\n" +
                "----------------------------------");
    }
    
    public void registrarAlunoNota() {
        System.out.println("Opção 1 selecionada. Registrar as notas de um novo aluno");
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next();

        System.out.println("Digite a nota da primeira avaliação do aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota da segunda avaliação do aluno: ");
        double nota2 = leitor.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        if(alunosRepository.getPosicao() < alunosRepository.getAlunos().length) {
            int posicao = alunosRepository.getPosicao();
            alunosRepository.alunos[posicao] = aluno;
            System.out.println("O código de " + alunosRepository.alunos[posicao].getNome() + " é " + posicao + "\n");
            posicao = posicao + 1;
        } else {
            System.out.println("Array cheio. Não é possível cadastrar mais alunos.");
        }
    }
    
    public void consultarBoletim() {
        
        System.out.println("Opção 2 selecionada. Consultar boletim de um aluno");
        System.out.println("Digite o código do aluno: ");
        int codigo = leitor.nextInt();
        
        System.out.println(alunosRepository.alunos[codigo]);
        double media = (alunosRepository.alunos[codigo].getNota1() + alunosRepository.alunos[codigo].getNota2()) / 2;

        if (media < 4) {
            System.out.println("Situação: Reprovado\n\n");
        } else if (media >= 4 && media < 7) {
            System.out.println("Situação: Prova final\n\n");
        } else {
            System.out.println("Situação: Aprovado\n\n");
        }
    }
    
    public void consultarNotasTurma() {
        
        for(int i = 0; i < alunosRepository.alunos.length; i++) {
            Aluno aluno = alunosRepository.alunos[i];
            if(aluno != null) {
                System.out.println(alunosRepository.alunos[i].toString());
                double media = (alunosRepository.alunos[i].getNota1() + alunosRepository.alunos[i].getNota2()) / 2;
                if (media < 4) {
                    System.out.println("Situação: Reprovado(a)\n\n");
                } else if (media >= 4 && media < 7) {
                    System.out.println("Situação: Recuperação\n\n");
                } else {
                    System.out.println("Situação: Aprovado\n\n");
                }
            }
        }
    }
    
    public void chooseMenuOption() {
        System.out.println("Digite a opção: ");
        int opcao = leitor.nextInt();

        while (opcao != 4) {
            if(opcao == 1) {
                registrarAlunoNota();
            } else if(opcao == 2) {
                consultarBoletim();
            } else if(opcao == 3) {
                consultarNotasTurma();
            } else {
                System.out.println("Opcao nao conhecida.");
            }
            showMenu();
            System.out.println("Digite a opção:");
            opcao = leitor.nextInt();
        }
        System.out.println("Opção 4 selecionada. Saindo do programa.");
    }
    
}
