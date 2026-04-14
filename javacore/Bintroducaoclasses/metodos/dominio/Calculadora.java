package devDojo.javacore.Bintroducaoclasses.metodos.dominio;
//Aula 47
public class Calculadora {
//void = vazio - sem nenhum retorno

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros (double num1, double num2 ){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02 (double num1, double num2 ){
        if (num2 != 0){
            return num1 / num2;
        }
//        System.out.println("Nao existe divisao por 0");

        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros (double num1, double num2 ){
        if (num2 == 0){
            System.out.println("Nao existe divisao por 0");
            return; // <-- serve como um break
        }
        System.out.println(num1 / num2);
    }
}