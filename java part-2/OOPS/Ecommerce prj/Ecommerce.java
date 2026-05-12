import java.util.Scanner;
class User
{
	String userName;
	String userId;
	private long Phno;
 
	User(String userName,String userId,long Phno)
	{
		this.userName = userName;
		this.userId = userId;
		this.Phno = Phno;
	}
	// setter for Phno 
 
	public void setPhno(long Phno)
	{
		this.Phno = Phno;
	}
 
	// getter for Phno
 
	public long getPhno()
	{
		return Phno;
	}
 
	void userDetails()
	{
		System.out.println("\t\t========= User Details ======== ");
		System.out.println("\n\t\t\tuser name is : "+userName);
		System.out.println("\t\t\tuser id is : "+userId);
	}
}


class Product
{
	String productName;
	String pid;
	double price;
 
	Product(String productName,String pid,double price)
	{
		this.productName = productName;
		this.pid = pid;
		this.price =price;
	}	
 
	void productDetails()
	{
		System.out.println("\n\t\t===========Product Details==========");
		System.out.println("\n\t\t\tProduct Name is "+productName);
		System.out.println("\t\t\tProduct Price is "+price+" Rs");
		System.out.println("\t\t\tProduct Id is "+pid);
	}
}


interface Payment
{
	void pay(double amount);
}

class Cash implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("\n\t\tpayment "+amount+" Rs done by cash");
	}
}

class Upi implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("\n\t\tpayment "+amount+" Rs done by upi");
	}
}

class Card implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("\n\t\tpayment "+amount+" Rs done by card");
	}
}

class  Ecommerce
{
	static
	{
		System.out.println("\n\n\t\t\tWelomce To Ecommerce Application\n\n");
	}
 
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) 
	{
		User u1 = new User("rohit","user100",1234567890L);
		u1.userDetails();
  
		Product p1 = new Product("laptop","product1",60000);
		Product p2 = new Product("camera","product2",15000);
		Product p3 = new Product("mobile","product3",45000);
  
		Product products[] = new Product[3];
  
		products[0] = p1;
		products[1] = p2;
		products[2] = p3;
  
  
		System.out.print("\n\t\tenter your phone number : ");
		long ph = sc.nextLong();
  
		if(ph == u1.getPhno())
		{
  
			for(Product p : products)
			{
				p.productDetails();
			}
  
  
		System.out.print("\n\t\tselect your product : ");
		int productOption = sc.nextInt();
  
		double productPrice = products[productOption-1].price;
		System.out.println("\n\t\tProduct price is "+productPrice);
     
		double finalPrice = productPrice * 1.18 * 0.6;
		System.out.println("\t\tyou have to pay :"+finalPrice+" Rs");
    
  
		System.out.print("\n\t\t==========Payment Options========== : \n"); 
		System.out.println("\t\t1.UPI");
		System.out.println("\t\t2.CARD");
		System.out.println("\t\t3.CASH");
  
		System.out.print("\n\t\tselect any one payment method : ");
		int paymentOption = sc.nextInt();
  
   
  
		Payment payment = null;
  
		if(paymentOption==1)
		{
			payment = new Upi();
			payment.pay(finalPrice);
		}
		else if(paymentOption==2)
		{
			payment = new Card();
			payment.pay(finalPrice);
		}
		else if(paymentOption==3)
		{
			payment = new Cash();
			payment.pay(finalPrice);
		}
		else
		{
			System.out.println("\t\t\tinvalid payment method");
		}
  
	
		System.out.println("\t\t\tOrder is Placed");
  
		}
		else
		{
			System.out.println("\n\t\tLogin not possible");
		}
	}
}