import java.io.StringReader;
import java.util.ArrayList;

public class ProductCatalogExample {

    static class InvalidPriceException extends Exception{
        InvalidPriceException(String msg){
            super(msg);
        }
    }


    static class Product{
        private int id;
        private String name;
        private int price;

        Product(int id, String name, int price){
            try{
                if(price<0){
                    throw new InvalidPriceException("Price of a product cound not be negitive!!.");
                }else{
                    this.id=id;
                    this.name=name;
                    this.price=price;
                }
            }catch (InvalidPriceException e){
                System.out.println(e);
            }
        }

        void getDetails() {
            System.out.println(this.id+":"+this.name+":"+this.price);
        }

        void setPrice(int newPrice){
            this.price=newPrice;
        }

        void setName(String name){
            this.name= name;
        }

    }

    public static void main(String[] args){
        Product p1 = new Product(101,"ABC",100);
        Product p2 = new Product(102,"XYZ",120);
        Product p3 = new Product(103,"ZSE",180);
        Product p4 = new Product(104,"XDR",169);
        Product p5 = new Product(105,"CFT",178);

        Product err = new Product(105,"CFT",-1);

        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        for(Product x : list){
            x.getDetails();
        }

    }
}
