package ch2Obeserver.SelfObserver.inter;

/**
 * Created by zhangzj on 2016/11/26.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
