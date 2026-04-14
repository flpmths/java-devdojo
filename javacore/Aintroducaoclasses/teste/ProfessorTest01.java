package devDojo.javacore.Aintroducaoclasses.teste;

import devDojo.javacore.Aintroducaoclasses.dominio.Professor;

import java.sql.SQLOutput;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
