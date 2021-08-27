package Questions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Laptop[] l = new Laptop[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int laptopId = Integer.parseInt(scanner.nextLine());
            String brand = scanner.nextLine();
            String processor = scanner.nextLine();
            String storageType = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine());
            l[i] = new Laptop(laptopId, brand, processor, storageType, price);
        }

        Laptop pricey = getLaptopWithMaxPrice(l);
        if (pricey != null) {
            System.out.println(pricey.getBrand());
        }

        int id = Integer.parseInt(scanner.nextLine());
        String brand = null;
        if ((brand = getBrandForGivenId(l, id)) != null) {
            System.out.println(brand);
        } else {
            System.out.println("No laptop available for the given ID");
        }

        scanner.close();
    }

    public static Laptop getLaptopWithMaxPrice(Laptop[] laptop) {
        int maxPrice = 0;
        Laptop l = laptop[0];
        for (Laptop laptop2 : laptop) {
            if (laptop2.getPrice() > maxPrice) {
                maxPrice = laptop2.getPrice();
                l = laptop2;
            }
        }
        return l;
    }

    public static String getBrandForGivenId(Laptop[] laptop, int id) {
        String brand = null;
        for (Laptop laptop2 : laptop) {
            if (laptop2.getLaptopId() == id) {
                brand = laptop2.getBrand();
                break;
            }
        }
        return brand;
    }
}

class Laptop {
    int laptopId;
    String brand;
    String processor;
    String storageType;
    int price;

    public Laptop() {

    }

    public Laptop(int laptopId, String brand, String processor, String storageType, int price) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.processor = processor;
        this.storageType = storageType;
        this.price = price;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
