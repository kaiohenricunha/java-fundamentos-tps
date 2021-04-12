import java.util.InputMismatchException;
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
    
    public void registrarAluno() throws InputMismatchException {
        System.out.println("Opção 1 selecionada. Registrar as notas de um novo aluno");
        
        System.out.println("Informe o nome do aluno: ");
        StringBuilder sbNome = new StringBuilder();
        String nome = leitor.next();
        leitor.useDelimiter("\\n");
        sbNome.append(nome + " ");
        System.out.println("Informe o sobrenome do aluno: ");
        String sobrenome = leitor.next();
        leitor.useDelimiter("\\n");
        sbNome.append(sobrenome);

        System.out.println("Digite a nota da primeira avaliação do aluno: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota da segunda avaliação do aluno: ");
        double nota2 = leitor.nextDouble();
        
        try{
         alunosRepository.salvarAluno(sbNome, nota1, nota2);
        } catch(Exception exc) {
            System.err.println(exc.getMessage());
        }
    }
    
    public void consultarBoletim() {
        
        System.out.println("Opção 2 selecionada. Consultar boletim de um aluno");
        System.out.println("Informe o código: ");
        int codigo = leitor.nextInt();
        if (alunosRepository.consultarAluno(codigo) != null) {
            System.out.println(alunosRepository.alunos[codigo].toString());
        } else {
            System.out.println("Nenhum resultado encontrado para o código " + codigo);
        }
    }
    
    public void consultarNotasTurma() {
        
        for(int i = 0; i < alunosRepository.alunos.length; i++) {
            Aluno aluno = alunosRepository.alunos[i];
            if(aluno != null) {
                System.out.println(alunosRepository.alunos[i].toString());                
            }
        }
    }
    
    public void chooseMenuOption() {
        System.out.println("Digite a opção: ");
        int opcao = leitor.nextInt();
        
        while (opcao != 4) {
            if(opcao == 1) {
                registrarAluno();
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
