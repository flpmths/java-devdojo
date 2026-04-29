package devDojo.javacore.Bintroducaoclasses.metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;


    public void imprime(){
        System.out.println("--------------");

        System.out.println(this.nome); //this para imprimir parametro dentro do objeto
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
