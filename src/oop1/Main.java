package oop1;
public class Main {
    public static void main(String[] args) {

       Product product1 = new Product();
     product1.setName("Delonghi Kahve Makinesi");
     product1.setDiscount(7);
     product1.getUnitPrice(5000);
     product1.setUnitsInstock(3);
     product1.setImageUrl("image1.jpg");


        Product product2 = new Product();
        product2.setName("Arçelik Kahve Makinesi");
        product2.setDiscount(4);
        product2.getUnitPrice(7500);
        product2.setUnitsInstock(4);
        product2.setImageUrl("image2.jpg");


        Product product3 = new Product();
        product3.setName("Beko Kahve Makinesi");
        product3.setDiscount(5);
        product3.getUnitPrice(7500);
        product3.setUnitsInstock(2);
        product3.setImageUrl("image3.jpg");


        Product [] products = {product1,product2,product3};

        for ( Product product : products ) {
            System.out.println(product.getName());
            System.out.println(product.getDiscount());
            System.out.println(product.getUnitsInstock());
            System.out.println(product.getImageUrl());



        }

    }
}