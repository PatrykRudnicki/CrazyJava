package ObjectOrientedProgramming.HashCode;

public class HashExample {
    public static void main(String[] args){
        Product prod1 = new Product("Chocolate", 2.99);
        Product prod2 = new Product("Chocolate", 2.99);

        System.out.println(prod1.equals(prod1));
        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode());
        System.out.println(prod2.hashCode());
    }
}
