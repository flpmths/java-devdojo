package devDojo.introducao;
//Operador ternario
public class aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        //(condicao) ? verdadeiro : falso

        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Sem saldo";
        String resultado = salario > 5000 ? mensagemDoar: mensagemNaoDoar;

        //ou

//        double salario = 6000;
//        String resultado = salario > 5000 ? "Eu vou doar 500": "Sem saldo";

        //utilizando diretamente os resultados e tirando as Strings mensagemDoar e MensagemNaoDoar

//########################################################################
//        String resultado;
//
//        if(salario > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }
//########################################################################
        //sintaxe operador ternario

        System.out.println(resultado);
    }
}
