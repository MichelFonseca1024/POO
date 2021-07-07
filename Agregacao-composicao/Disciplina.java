public class Disciplina {
    private String nome;
    protected int ch;
    private Professor professor;

    public Disciplina(String nome, int ch, Professor professor){
        this.nome = nome;
        this.ch = ch;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }
}