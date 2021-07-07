
public class Main {

    public static void main(String[] args) {
        Curso ads = new Curso("ADS");

        Professor jesiel = new Professor("Jesiel");
        Professor aislan = new Professor("Aislan");

        ads.adicionaDisciplina(new Disciplina("PI I", 68, jesiel));
        ads.adicionaDisciplina(new Disciplina("ES III", 30 , aislan));


        System.out.println("Curso: "+ ads.getNome());

        System.out.println("Disciplinas: ");
        
        for (Disciplina disciplina: ads.getDisciplinas()) {
            System.out.println(disciplina.getNome() + " | Carga Horaria: " + disciplina.ch);
        }

    }
}
