public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;

    public Aluno() {

    }

    public Aluno(String nome, double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + " " + getSobrenome() + "\n" +
                "Primeira nota: " + nota1 + "\n" +
                "Segunda nota: " + nota2 + "\n" +
                "Média: " + media + "\n" +
                "Situação: " + situacao;
    }
    
}
