import java.util.Objects;
class Marker{
    String brand;
    double price;
    String color;

    Marker(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

    @Override
    public String toString(){
        return "brand is: "+brand+"\nprice is: "+price+"\ncolor is: "+color;
    }

    @Override
    public boolean equals(Object obj){
        
        //downcating
        Marker m = (Marker) obj;

        return this.brand.equals(m.brand) && 
               this.price==m.price && 
               this.color.equals(m.color);
    }

    @Override
    public int hashCode(){

        return Objects.hash(brand,price,color);

    }

    public static void main(String[] args) {
        Marker m1 = new Marker("cello",100,"red");
        Marker m2 = new Marker("faber",120,"Black");
        Marker m3 = new Marker("cello",100,"red");

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("-------compare == operator-----------");

        System.out.println(m1 == m2);
        System.out.println(m1 == m3);

        System.out.println("------comapare equals() method------------");

        System.out.println(m1.equals(m2));
        System.out.println(m1 .equals(m3));

        
        System.out.println("------hashcode() after override------------");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());


    }

}