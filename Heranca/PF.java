import java.util.ArrayList;

public class PF extends Funcionario {

    private String CPF;

    public PF(String cpf, String nome, double salario) {
    	this.CPF = cpf;
      	this.salario = salario * 0.9;
      	this.beneficios = new ArrayList<String>();
          
        this.beneficios.add("Plano de saúde");
        this.beneficios.add("Vale refeção");
        this.beneficios.add( "Ferias");
    }

    
}