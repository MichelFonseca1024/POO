import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, ArrayList<Funcionario> funcionarios) {
    	this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
       
    }
    
}