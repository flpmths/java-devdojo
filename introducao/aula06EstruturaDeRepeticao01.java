package devDojo.introducao;

public class aula06EstruturaDeRepeticao01 {
    static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(count); //ou (++count) para imprimir de 1 a 10 [remover o count +=1]
            count += 1;
        }
        count = 0;
        do{
            System.out.println("Dentro do do-while "+ ++ count);
        } while (count < 10);

        for(count=0; count < 10; count++){
            System.out.println("For "+count);
        }
    }
}
