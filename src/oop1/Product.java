package oop1;

public class Product {

    private String name;
    private double unitPrice;
    private double discount;
     private String imageUrl;
    private int unitsInstock;

    public String getName() {
        return name;
    }

    public double getUnitPrice(int i) {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInstock() {
        return unitsInstock;
    }

    public void setUnitsInstock(int unitsInstock) {
        this.unitsInstock = unitsInstock;
    }

    public void setName(String name) {
        this.name = name;


    }

}

