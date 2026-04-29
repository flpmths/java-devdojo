package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Bintroducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros); //forma correta
        calculadora.somaArray(new int[] {1,2,3,4,5}); //tambem funciona porem o IDEAL é a açao de cima ↑

        calculadora.somaVarArgs(1,2,3,4,5,6,7); //forma mais facil ao inves de passar um array -- Transformado em Array atraves do JVM
    }
}
