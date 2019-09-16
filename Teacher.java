//teacher implements observer interface
public class Teacher implements Observer {
	Subject Watchman;
	//method created for teacher
	public Teacher(Subject Watchman) {
		this.Watchman=Watchman;
		Watchman.registerObserver(this);
	}
	//create if statement to determine which statement will be displayed for techer
	public void update(int warning) {
	if(warning==1)
	{
		System.out.println("Teacher:Help get every kid home safe");
	}
	else if(warning==2)
	{
		System.out.println("ShopOwner:Brings all students to the underground shelter");
	}
	}
}
