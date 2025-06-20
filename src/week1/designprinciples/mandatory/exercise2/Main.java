package week1.designprinciples.mandatory.exercise2;

import java.util.Arrays;
import java.util.Comparator;

/*
Exercise 2: E-commerce Platform Search Function
Scenario:
You are working on the search functionality of an e-commerce platform.
The search needs to be optimized for fast performance.
 */

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Saree", "Fashion"),
            new Product(3, "Earrings", "Accessories"),
            new Product(4, "Phone", "Electronics")
        };
        int targetID = 3;
        Product productFoundLS = linearSearch(products, targetID);
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product productFoundBS = binarySearch(products, targetID);

        System.out.println(productFoundLS);
        System.out.println(productFoundBS);
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
