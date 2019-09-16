
public interface Subject {
	//remove registerobserver method created that takes in parameter observer
	public void registerObserver(Observer observer);
	//remove removeobserver method created that takes in parameter observer
	public void removeObserver(Observer observer);
	//mehtod to notify observers
	public void notifyObservers();
}
