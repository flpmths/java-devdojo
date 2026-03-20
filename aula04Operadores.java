package devDojo;

public class aula04Operadores {
    static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // % para resto de porcentagem
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != Resulta em valores booleanos
        // para boolean usamos "is" como boa pratica

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("IsDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("IsDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte " + isDezIgualVinte);
        System.out.println("IsDezIgualDez " + isDezIgualDez);
        System.out.println("IsDezDiferenteDez " + isDezDiferenteDez);


        // && (AND)  || (OR) ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("IsDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        // || OR

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);


        //Operadores de atribuicao

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        System.out.println(contador);

    }
}
