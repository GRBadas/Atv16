import java.util.Scanner;
public class AtvOnze{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println(mathPrice());
 
    }

    public static int getUserH(String outputMessage){

        System.out.println(outputMessage);
        int H = input.nextInt();
        return H;
    }
    
    public static int mathPrice(){

        int totalTime, price, He, Hs;
        He = getUserH("Digite a hora de entrada :");
        Hs = getUserH("Digite a hora de saída :");

          if (Hs >= 24 || He >= 23) {
            System.out.println("Horário inválido, tente novamente");
            return mathPrice();
          }

       totalTime = Hs - He;

       if (totalTime < 3){
           price = totalTime*5;
           
        }

       else if (totalTime < 5){
        price = (totalTime - 2)*2 + 10;
         
       }
        
       else {
        price = (totalTime - 4) + 14;
    
       }
    return price;

    }
}

