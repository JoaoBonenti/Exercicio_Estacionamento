import java.util.Scanner;
public class ExercicioEstacionamento {
    public static void main(String[] args) {
        //Uso do Scanner para entrada de dados
        try (Scanner scan = new Scanner(System.in)) {
            //Entrada de dados da variável num 
            System.out.print("Digite '1' se voce for Idoso, '2' se voce for Deficiente, '3 se for Gestante ou '0' se nao for nenhum dos tres: ");
            int num = scan.nextInt(); 

            //Condicional para determinar se é possível ou não estacionar
            if (num == 1) 
            { System.out.print("Ok, voce pode estacionar"); }

            else if (num == 2)
            { System.out.print("Ok, voce pode estacionar"); }
            
            else if (num == 3)
            { System.out.print("Ok, voce pode estacionar"); }

            else 
            {System.out.print("Voce nao pode estacionar!"); }
        }

         }

}
