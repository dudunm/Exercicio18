package com.mycompany.exercicio18;
import java.util.*;

public class Exercicio18 {

    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = scan1.nextLine();
        
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Preço do produto: ");
        String preco = scan2.nextLine();
        double x = Double.parseDouble(preco);
        
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Categoria do produto (A, B, C, D ou E): ");
        String categoria = scan3.nextLine();
        
        switch(categoria) {
        case "A":
            double precoA = (x * 10) / 100;
            double precoAfinal = x - precoA;
            System.out.println("Olá "+nome+" o preço final da sua compra é R$"+precoAfinal);
            break;
        case "B":
            double precoB = (x * 15) / 100;
            double precoBfinal = x - precoB;
            System.out.println("Olá "+nome+" o preço final da sua compra é R$"+precoBfinal);
            break;
        case "C":
            double precoC = (x * 20) / 100;
            double precoCfinal = x - precoC;
            System.out.println("Olá "+nome+" o preço final da sua compra é R$"+precoCfinal);
            break;
        case "D":
            double precoD = (x * 25) / 100;
            double precoDfinal = x - precoD;
            System.out.println("Olá "+nome+" o preço final da sua compra é R$"+precoDfinal);
            break;
        case "E":
            double precoE = (x * 50) / 100;
            double precoEfinal = x - precoE;
            System.out.println("Olá "+nome+" o preço final da sua compra é R$"+precoEfinal);
            break;
        default:
            System.out.println("As categorias são A, B, C, D ou E. Escolha entre elas.");
        }
    }
}
