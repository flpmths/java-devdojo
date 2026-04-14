package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Bintroducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
