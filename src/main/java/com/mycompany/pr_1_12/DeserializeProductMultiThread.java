package com.mycompany.pr_1_12;
import com.mirea.kt.example.Product;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeProductMultiThread extends Thread {
    private String filePath;

    public DeserializeProductMultiThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Product product = (Product) objectIn.readObject();

            objectIn.close();
            fileIn.close();

            // Вывод содержимого полей объекта класса Product в консоль
            System.out.println("Содержимое полей объекта класса Product:");
            System.out.println("Код: " + product.getCode());
            System.out.println("Название: " + product.getName());
            System.out.println("Тип: " + product.getType());
            System.out.println("Скидка: " + product.isDiscount());
            System.out.println("Ингредиенты: " + product.getIngredients());
            System.out.println("Цена: " + product.getPrice());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}