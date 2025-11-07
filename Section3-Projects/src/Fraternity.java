import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;
        System.out.print("How old are you? \t"); //o print não faz a quebra de linha e o \t é uma tabulação ou seja um espaço.
        age = keyboard.nextInt();
        System.out.print("What's your gender? ex. male (M) or female (F): \t");
        gender = keyboard.next().charAt(0);

        //minha solução
        /*
        switch(gender){
            case 'M':
            case 'm':
                if (age >= 19){
                    System.out.println("Você foi elegível na fraternidade.");
                }
                else{
                    System.out.println("Você não foi elegível na fraternidade.");
                }
                break;
            case 'F':
            case 'f':
                System.out.println("Você não foi elegível na fraternidade.");
                break;
            default:
                System.out.println("Valor para o genero incorreto.");
        }//end switch
        */

        //Solução Professor

        if (age >= 19 && gender == 'M'|| gender == 'm'){
            System.out.println("Voce foi elegível na fraternindade");
        }
        else{
            System.out.println("Voce não foi elegível na fraternidade");
        }//end if

    }
}
