package com.product.updater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        System.out.println("=== Product Price Updater ===");
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        System.out.print("Enter New Price: ");
        double price = sc.nextDouble();

        boolean updated = dao.updatePrice(id, price);

        if (updated) {
            System.out.println("✅ Price updated successfully!");
        } else {
            System.out.println("❌ Product not found or update failed.");
        }

        sc.close();
    }
}