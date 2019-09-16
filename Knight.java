//knight implements observer interface
public class Knight implements Observer {
	Subject Watchman;
	//knight method created
	public Knight(Subject Watchman) {
		this.Watchman=Watchman;
		Watchman.registerObserver(this);
	}
	//create if statement to determine which statement will be displayed for knight
	public void update(int warning) {
	if(warning==1)
	{
		System.out.println("Knight:Helps everyone get home safe");
	}
	else if(warning==2)
	{
		System.out.println("Knight:Prepares for battle");
	}
	}
}
