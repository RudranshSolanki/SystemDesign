import java.util.*;


class Carts{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println(product.name+" added to cart");
    }
    public void removeProduct(Product product){
        products.remove(product);
        System.out.println(product.name+" removed from cart");
    }
    public int calculateTotal(){
        int totalPrice = 0;
        for(Product product:products){
            totalPrice+=product.price;
        }
        return totalPrice;
    }
    public List<Product> getProducts(){
        return products;
    }

}