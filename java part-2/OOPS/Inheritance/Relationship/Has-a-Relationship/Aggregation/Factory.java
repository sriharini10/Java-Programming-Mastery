class MusicPlayer
{
	MusicPlayer()
	{
		System.out.println("Music player created");
	}
	
	void song()
	{
		System.out.println("Dheema song playing");
	}
	
}


class Car
{
	Car()
	{
		System.out.println("BMW is manufatured");
	}
	
	Car(MusicPlayer mp)
	{
		System.out.println("RR is manufactured");
		
		mp.song();
	}
}


class Factory
{
	public static void main(String[] args) 
	{
		
		Car BMW = new Car();
		
		System.out.println("----------------------------");
		
		MusicPlayer mp = new MusicPlayer();
		
		Car RR = new Car(mp);
	}
}
