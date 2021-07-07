import java.util.ArrayList;

public class PJ extends Funcionario {

    private String CNPJ;

    public PJ(String cnpj, String nome, double salario) {
    	this.CNPJ = cnpj;
      	this.salario = salario * 0.95;
      	this.beneficios = new ArrayList<String>();
          
        this.beneficios.add("Plano de saúde");
    }

    
}