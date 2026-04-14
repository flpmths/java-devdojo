package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Bintroducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("-----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(36, 5);

        //int pode "caber" dentro de um double utilizando o metodo CAST
        // CAST é a conversão de um tipo de dado para outro
    }
}
