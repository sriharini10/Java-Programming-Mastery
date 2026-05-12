class  Movie
{
	String  movieName;
	String hero;
	String heroine;
	
	Movie(String mn, String actor, String actress)
	{
		//L.I
		
		movieName = mn;
		hero = actor;
		heroine = actress;
	}
	
	void movieDetails()
	{
		System.out.println("Movie name is: " +movieName);
		System.out.println("hero  name is: " +hero);
		System.out.println("heroine name is: " +heroine);
	}
}


class Director
{
	public static void main(String args[])
	{
		Movie m1 = new Movie("Leo","Vijay","Trisha");
		
		m1.movieDetails();
		
		System.out.println("----------------------------------------");
		
		Movie m2 = new Movie("Bahubali","prabhas","anushka");
		
		m2.movieDetails();
		
		
	}
}
