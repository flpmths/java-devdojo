package devDojo;

public class aula06EstruturaDeRepeticao05 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condicao valorParcela >= 1000
    static void main(String[] args) {
        double valorTotal = 35000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
    }
}
