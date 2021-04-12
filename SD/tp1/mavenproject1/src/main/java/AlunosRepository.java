public class AlunosRepository {
    protected static Aluno[] alunos = new Aluno[100];
    protected static int posicao = 0;

    public Aluno[] listarAlunos() {
        return alunos;
    }

    public static boolean temEspaco() {
        if (posicao < alunos.length) {
            return true;
        }
        return false;
    }

    public static void salvarAluno(Aluno aluno) {
        alunos[posicao] = aluno;
        posicao++;
    }

    public static int getPosicao() {
        return posicao;
    }

    public static void setPosicao(int posicao) {
        AlunosRepository.posicao = posicao;
    }

    public static Aluno[] getAlunos() {
        return alunos;
    }

    public static void setAlunos(Aluno[] alunos) {
        AlunosRepository.alunos = alunos;
    }
}
