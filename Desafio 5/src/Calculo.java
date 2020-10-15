import java.util.Scanner;

public class Calculo {

    double L;
    double area;
    double pagar;
    double salario;
    Scanner prompt = new Scanner(System.in);

    double faz(){
        System.out.println("Digite o valor da dimensao L");
        L= prompt.nextDouble();
        System.out.println("Digite o valor do salario minimo");
        salario= prompt.nextDouble();

        area=  (((2*L)*(4*L))+ (((9*L)*L)/2) + (4*(3.14*(L/2)*(L/2))) + ((3*L)*L*0.7))/2 ;
        pagar=  (((salario*0.10)*area)*40);


       return pagar;


    }

    @Override
    public String toString() {
        return "Você ira pagar para o total de pedreiros: "+pagar+"R$";
    }
}
