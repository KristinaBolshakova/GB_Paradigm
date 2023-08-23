package HW3.Part1;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
}
