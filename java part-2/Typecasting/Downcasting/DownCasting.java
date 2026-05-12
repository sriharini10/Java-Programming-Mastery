class Harry
{
    int x=10;
}

class Shinchan extends Harry
{
    int y=20;
}
class Himavari extends Harry
{
    int z=30;
}
class Shiro extends Harry
{
    int w=50;
}


class DownCasting {
    public static void main(String[] args) {
        
        Harry h1=new Shinchan();//Upcasting 
        System.out.println (h1.x);
        
        Shinchan sh =(Shinchan) h1;//downcasting
		System.out.println (sh.x);
        System.out.println (sh.y);
        
		
        Harry h3=new Himavari(); //upcating
        Himavari ob= (Himavari) h3;//downcasting
        System.out.println (ob.x);
        System.out.println (ob.z);
		
        Harry h2=new Shiro();  //upcasting
        Shiro sh1= (Shiro) h2;  //downcasting
        System.out.println (sh1.x);
        System.out.println (sh1.w);
    }
}