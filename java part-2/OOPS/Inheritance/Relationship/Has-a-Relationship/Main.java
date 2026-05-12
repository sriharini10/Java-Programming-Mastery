class Phone
{
	Battery b1 = new Battery();
	
	Phone()
	{
		
		
		b1.start();
		
		System.out.println("Vivo is manufactured");
	}
	
	Phone(Camera c1)
	{
		
		
		b1.start();
		
		System.out.println("Samsung is manufactured");
		
		c1.takePhoto();
	}
}

class Battery
{

	// default constructor is here
	
	//---------
	
	void start()
	{
		System.out.println("Battery is started");
	}
}

class Camera
{
	Camera()
	{
		System.out.println("camera is manufactured");
	}
	
	void takePhoto()
	{
		System.out.println("Photos are clicked");
	}
}



class Main
{
	public static void main(String[] args) 
	{
		Phone vivo = new Phone();
		
		System.out.println("---------------------------");
		
		Camera c1 = new Camera();
		
		Phone samsung = new Phone(c1);
		
		
		
		
	}
}
