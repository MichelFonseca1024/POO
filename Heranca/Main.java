import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
    
        String cpf = "289.914.375-16";
        String pf_nome = "Matheus Henrique da Silva";
        double pf_salario = 2000;

        PF pf = new PF(cpf, pf_nome, pf_salario);
        System.out.printf("PF tem salário de %.2f \n", pf.getSalarioLiquido());
        System.out.printf("Com beneficios: %s \n\n", pf.getBeneficios());

        String cnpj = "31.234.017/0001-37";
        String pj_nome = "Tiago Enzo Dias";
        double pj_salario = 3800;

        PJ pj = new PJ(cnpj, pj_nome, pj_salario);
        System.out.printf("PJ tem salário de %.2f \n", pj.getSalarioLiquido());
        System.out.printf("Com beneficios: %s \n", pj.getBeneficios());

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(pf);
        funcionarios.add(pj);

        Empresa google = new Empresa("Google", funcionarios);
        
        
        System.out.println("Funcionarios: ");
        
        for (Funcionario funcionario: google.getFuncionarios()) {
            System.out.println(funcionario.nome);
        }
    }
}