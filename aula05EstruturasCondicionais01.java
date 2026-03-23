package devDojo;
//Estruturas Condicionais
public class aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcolica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolica");
        }
        System.out.println("Fora do if");
    }
}
