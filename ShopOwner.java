//shopowner implements observer
public class ShopOwner implements Observer {
	Subject Watchman;
	//shopowner method created
	public ShopOwner(Subject Watchman) {
		this.Watchman=Watchman;
		Watchman.registerObserver(this);
	}
	//create if statement to determine which statement will be displayed for knight
	public void update(int warning) {
	if(warning==1)
	{
		System.out.println("ShopOwner:Close down shop and head home");
	}
	else if(warning==2)
	{
		System.out.println("ShopOwner:Drops everything and find nearest hideout");
	}
	}
}
