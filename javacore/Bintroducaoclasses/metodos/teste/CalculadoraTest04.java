package devDojo.javacore.Bintroducaoclasses.metodos.teste;

import devDojo.javacore.Bintroducaoclasses.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2); //Chamada do metodo
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }
}
//Variavel nunca vai ser alterada em parametros tipos primitivos