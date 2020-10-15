import java.util.Scanner;
public class Calculo {
   int D;

   int Rmaior, R1, R2 ,R3 , R4, R5;
   double At, A1, A2 ,A3 , A4, A5, A6;
   double total;



   Scanner prompt = new Scanner(System.in);

   double pede(){

    System.out.println("Digite aqui o Diametro do circulo maior em cm");
    this.D=prompt.nextInt();


    //relaçao dos raios
       Rmaior = D / 2;
       R1 = Rmaior / 6;
       R2 = 2 * R1;
       R3 = 3 * R2;
       R4 = 4 * R3;
       R5 = 5 * R4;



       //Areas

       A1 = (3.14 * (R1 * R1));
       A2 = 3.14 * R2 * R2;
       A3 =  (3.14 * R3 * R3);
       A4 = 3.14 * R4 * R4;
       A5 = 3.14 * R5 * R5;
       A6 = 3.14 * Rmaior * Rmaior;

        // Total areas
       At = A1 + A2 + A3 + A4 + A5 + A6;
       total= At*5000;
       return total;


   }

    @Override
    public String toString() {
        return  "Voce precisara de " + total+"cm²"+" de papelao";

    }

}
