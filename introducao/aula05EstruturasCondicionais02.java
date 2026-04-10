package devDojo.introducao;

public class aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 18;
        String categoria;
        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}

//variaveis locais precisam ser inicializadas dentro do escopo, caso contrario havera erro de compilacao
