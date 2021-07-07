import java.util.ArrayList;

public class Funcionario {

    protected String nome;
    protected double salario;
    protected ArrayList<String> beneficios;

    public double getSalarioLiquido() {
        return this.salario;
    }

    public String getBeneficios() {
       
        String beneficiosReturn = String.join(", ", this.beneficios);
        return beneficiosReturn;
    }

    public String getNome() {
        return this.nome;
    }

}