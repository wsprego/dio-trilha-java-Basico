package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}