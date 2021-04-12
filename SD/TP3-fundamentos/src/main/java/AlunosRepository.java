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
    
    public Aluno consultarAluno(int codigo) {
        try {
            Aluno aluno = alunos[codigo];
            return aluno;
        } catch (Exception e){
            System.out.println("Esse aluno não está cadastrado.");
            return null;
        }
    }
    
    private void validarNomePessoa(StringBuilder nome) throws InvalidAlunoException {
        if (nome == null || nome.length() < 3) {
            throw new InvalidAlunoException(nome + " inválido.");
        }
    }

    public boolean salvarAluno(StringBuilder nome, double notaum, double notadois) throws InvalidAlunoException {
        validarNomePessoa(nome);
        if (temEspaco()) {
            Aluno aluno = new Aluno();
            String[] nomeFinal = nome.toString().split(" ");
            aluno.setNome(nomeFinal[0]);
            aluno.setSobrenome(nomeFinal[1]);
            aluno.setId(this.posicao);
            aluno.setNota1(notaum);
            aluno.setNota2(notadois);
            double media = (notaum + notadois) / 2;
            aluno.setMedia(media);
        
            if (aluno.getMedia() < 4) {
                aluno.setSituacao("Reprovado");
            } else if (aluno.getMedia() >= 4 && aluno.getMedia() < 7) {
                aluno.setSituacao("Recuperação");
            } else {
                aluno.setSituacao("Aprovado");
            }
            
            alunos[posicao] = aluno;
            System.out.println("O código do aluno é " + posicao);
            posicao++;
            return true;
        }
        return false;
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
