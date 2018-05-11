package ObjectOrientedProgramming.HashCode;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean equals(Object product){
        if(product == null){
            return false;
        }
        if(product instanceof Product){
            Product otherProduct= (Product) product;
            return this.name.equals(otherProduct.name) && this.price == otherProduct.price;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31; // We need to use prime number more than or equal 31
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
