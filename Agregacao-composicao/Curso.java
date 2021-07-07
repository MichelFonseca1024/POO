import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getNome() {
        return nome;
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
