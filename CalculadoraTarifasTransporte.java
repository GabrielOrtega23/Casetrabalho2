/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratarifastransporte;

/**
 *
 * @author support
 */
import java.util.Scanner;

public class CalculadoraTarifasTransporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibir opções de transporte
        System.out.println("Escolha o tipo de transporte:");
        System.out.println("1 - Ônibus urbano");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem intermunicipal");
        System.out.println("4 - Ônibus rodoviário");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        // Pedir quantidade de bilhetes
        System.out.print("Digite a quantidade de bilhetes: ");
        int qtd = sc.nextInt();

        double total = 0;

        // Usar switch para calcular o valor de acordo com a opção
        switch (opcao) {
            case 1:
                total = qtd * 4.40;
                System.out.println("Total a pagar: R$ " + total);
                break;
            case 2:
                total = qtd * 5.00;
                System.out.println("Total a pagar: R$ " + total);
                break;
            case 3:
                total = qtd * 8.50;
                System.out.println("Total a pagar: R$ " + total);
                break;
            case 4:
                total = qtd * 12.00;
                System.out.println("Total a pagar: R$ " + total);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}