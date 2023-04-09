import java.util.Scanner;

/*Faça um Programa que pergunte quanto 
você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês. */

public class App {
    public static void main(String[] args) throws Exception {
        double hora;
        double salario;
        double total;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Qual o valor recebido por horas trabalhadas? ");
        salario = dig.nextInt();
        System.out.println("Qual a quantidade de horas trabalhadas no mês em que foi realizado o serviço?");
        hora = dig.nextInt();
        total = salario * hora;
        System.out.println("o valor total do salario deste mês trabalhado é de $" + total);

    }
}
