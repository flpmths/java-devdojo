package devDojo.exercicioMetodo;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fellipe";
        funcionario.idade = 31;
        funcionario.salarios = new double[] {1.200, 2.100, 3.450};

        funcionario.imprime();
    }
}