public class Laptop {
    String brand;
    double price;
    String color;

    Laptop(String brand, double price, String color ) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        
    }

    @Override
    protected void finalize(){
        System.out.println("Object is deleted");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("hp",70000,"silver");

        Laptop l2 = new Laptop("dell",60000,"black");


        System.out.println("Laptop name is: "+l1.brand);
        System.out.println("Laptop price is: "+l1.price);
        System.out.println("Laptop color is: "+l1.color);


        System.out.println("Laptop name is: "+l2.brand);
        System.out.println("Laptop price is: "+l2.price);
        System.out.println("Laptop color is: "+l2.color);

        l1 = null;

        System.gc();   //garbage collector ,it delete the object in heap area which have not any reference

    }

     
}
