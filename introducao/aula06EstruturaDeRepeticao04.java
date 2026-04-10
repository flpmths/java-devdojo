package devDojo.introducao;

public class aula06EstruturaDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condicao valorParcela >= 1000
    static void main(String[] args) {
        double valorTotal = 35000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + "R$ " + valorParcela);
        }

    }
}
