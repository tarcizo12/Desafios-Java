import java.util.Scanner;
public class Escada {
    double Hipo;
    double H;
    double X;

    Scanner prompt = new Scanner(System.in);
    void faz(){

        System.out.println("Digite a altura do prego");
        this.H=prompt.nextInt();
        System.out.println("Digite a distancia da escada ate a parede");
        this.X=prompt.nextInt();




    }

    double calcula(){


        Hipo = (int) Math.sqrt((H*H)+(X*X));

        return ((Hipo/30)+1);


    }

    @Override
    public String toString() {
        return  "Sua escada ira precisar de "+ ((Hipo/30)+1)+ " degraus ";

    }
}
