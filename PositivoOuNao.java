import java.util.Scanner;

public class PositivoOuNao {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        
        double num;
        
        System.out.println("Digite um número: ");
        num = scanner.nextDouble();
            
        if(num > 0){
                System.out.println(num +" é positivo");
        }else{
            System.out.println(num +" é negativo");
        }
        
        scanner.close();
    }
}