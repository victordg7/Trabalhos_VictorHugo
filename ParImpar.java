import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num;

    System.out.println("Digite um número inteiro: ");
    num = scan.nextInt();

    if(num % 2 == 0){
        System.out.println(num +" é par");
    }else{
        System.out.println(num +" é ímpar");
    }

    scan.close();
    }
}
