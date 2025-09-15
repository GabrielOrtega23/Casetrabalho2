/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladoratendimentobancario;

/**
 *
 * @author support
 */
import java.util.Scanner;

public class SimuladorAtendimentoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saldo inicial fictício
        double saldo = 1000.0;

        // Exibir menu
        System.out.println("Menu de atendimento:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Sacar dinheiro");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Encerrar atendimento");
        System.out.print("Escolha a opção: ");
        int opcao = sc.nextInt();

        // Usar switch para tratar a opção
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é: R$ " + saldo);
                break;
            case 2:
                System.out.print("Digite o valor para sacar: ");
                double saque = sc.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo = saldo - saque;
                    System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
                }
                break;
            case 3:
                System.out.print("Digite o valor para depositar: ");
                double deposito = sc.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
              
            case 4:
                System.out.println("Atendimento encerrado.");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}

    
