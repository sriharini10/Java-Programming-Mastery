class Static_Variable_Movie
{
	static String MovieName;
	
	public static void main(String[] args)
	{
	
		System.out.println(MovieName);     //directly 
	
		System.out.println(Static_Variable_Movie.MovieName);    //by using classname
	
		Static_Variable_Movie m1 = new Static_Variable_Movie();
	
		System.out.println(m1.MovieName);      // By using object reference

	}
}
