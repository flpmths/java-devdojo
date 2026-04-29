package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {

        Estudante estudante01 = new Estudante(); // variavel de referencia | objeto
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Charlie";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Brownie";
        estudante02.idade = 18;
        estudante02.sexo = 'F';


    }
}
