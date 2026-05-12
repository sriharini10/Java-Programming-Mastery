class Webseries
{
	private String name;
	private int episodes;
	private double ratings;
	private boolean acertified;
	
	Webseries(String name, int episodes, double ratings, boolean acertified)
	{
		this.name = name;
		this.episodes = episodes;
		this.ratings = ratings;
		this.acertified = acertified;
	}
	
	//getter method for name 
	
	public String getName()
	{
		return name;
	}
	
	//getter method for episodes
	
	public int getEpisodes()
	{
		return episodes;
	}
	
	// getter methiod for rating
	
	public double getRatings()
	{
		return ratings;
	}
	
	//getter method for acertified
	public boolean getAcertified()
	{
		return acertified;
	}
	
	//setter method for name
	public void setName(String name)
	{
		this.name = name;
	}
	
	//setter method for episiodes
	
	public void setEpisodes(int episodes)
	{
		this.episodes = episodes;
	}
	
	//setter meothod for ratings
	
	public void setRatings(double ratings)
	{
		this.ratings = ratings;
	}
	
	// setter method for acertified
	
	public void setAcertified(boolean acertified)
	{
		this.acertified = acertified;
	}
	
}


class Netflix
{
	public static void main(String[] args) 
	{
		Webseries w1 = new Webseries("Dark",8,9.2,true);
		
		System.out.println( w1.getName() );
		System.out.println( w1.getEpisodes() );
		System.out.println( w1.getRatings() );
		System.out.println( w1.getAcertified() );
		
		
		System.out.println("-----------Afetr changing the data--------------" );
		
		w1.setName("Breaking Bad");
		w1.setEpisodes(10);
		w1.setRatings(9.8);
		w1.setAcertified(false);
		
		System.out.println( w1.getName() );
		System.out.println( w1.getEpisodes() );
		System.out.println( w1.getRatings() );
		System.out.println( w1.getAcertified() );
	}
}
