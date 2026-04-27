package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Aintroducaoclasses.dominio.Estudante;
import devDojo.javacore.Bintroducaoclasses.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante(); // variavel de referencia | objeto
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Charlie";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Brownie";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01); //

        impressora.imprime(estudante02);

        System.out.println("###########");

        impressora.imprime(estudante01);
        
        impressora.imprime(estudante02);

//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("----------------");
//
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);
    }
}


