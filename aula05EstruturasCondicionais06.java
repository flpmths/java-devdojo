package devDojo;

public class aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        //Utilizando Switch e Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando  1 como domingo
        byte dia = 6;
        switch (dia){
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}

//caso de resolucao mas vai depender de empresa
