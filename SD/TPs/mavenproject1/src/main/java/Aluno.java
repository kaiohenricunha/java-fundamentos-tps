public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno() {

    }

    public Aluno(String nome, double av1, double av2) {
        this.nome = nome;
        this.nota1 = av1;
        this.nota2 = av2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(float av1) {
        this.nota1 = av1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(float av2) {
        this.nota2 = av2;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + nome + '\n' +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2;
    }
}
