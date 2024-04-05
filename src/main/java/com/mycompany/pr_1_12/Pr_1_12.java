package com.mycompany.pr_1_12;
import java.util.Scanner;

public class Pr_1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу для десериализации: ");
        String filePath = scanner.nextLine();

        DeserializeProductMultiThread deserializeThread = new DeserializeProductMultiThread(filePath);
        deserializeThread.start(); // Запуск потока десериализации
    }
}