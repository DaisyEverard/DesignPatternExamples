

public interface ISubjectPush {

    public void registerObserver(IObserverPush o);
    public void removeObserver(IObserverPush o);
    public void notifiyObservers();
}
