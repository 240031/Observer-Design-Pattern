
import java.util.ArrayList;
public class Watchman implements Subject{
	ArrayList<Observer>observers;
	private int warning;
	public Watchman() {
		observers=new ArrayList<Observer>();
		
	}
	//method to add observer
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	//method to remove observer
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	//notify observer method
	public void notifyObservers() {
		for(Observer observer: observers)
		{
			observer.update(warning);
		}
	}
	public void issueWarning(int warning)
	{
		//warning state displayed before notifying observers depending on the if statement
		this.warning=warning;
		if(warning==1)
		{
			System.out.println("Warning: Trumphet 1 was played!");
		}
		else if (warning==2)
		{
			System.out.println("Warning: Trumphet 2 was played!");
		}
		notifyObservers();	
	}
}
