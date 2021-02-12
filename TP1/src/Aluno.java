public class Aluno {
    private String nome;
    private double av1;
    private double av2;

    public Aluno() {

    }

    public Aluno(String nome, double av1, double av2) {
        this.nome = nome;
        this.av1 = av1;
        this.av2 = av2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public double getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + nome + '\n' +
                "Nota da AV2: " + av1 + "\n" +
                "Nota da AV1: " + av2;
    }
}
