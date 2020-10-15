
import java.util.Scanner;

public class Calculo {

    Scanner prompt = new Scanner(System.in);
    String num;
    int soma, tamanho, i=0, exp, compara;


void faz (){

    System.out.print("Digite aqui o numero para verificar");
    num= prompt.next();
    tamanho=num.length();
    compara= Integer.parseInt(num);

    while(i<tamanho){

        exp=Integer.parseInt(String.valueOf(num.charAt(i)));
        soma = (int) (soma + Math.pow(exp , tamanho));

        i++;
    }
   if(soma == compara ){
       System.out.print("Esse numero e narcisista");
                        }
   else{

       System.out.print("Esse numero nao e narcisista");

        }


}

}
