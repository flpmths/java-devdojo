package devDojo.javacore.introducaoclasses.teste;

import devDojo.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Fellipe";
        estudante.idade = 31;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
