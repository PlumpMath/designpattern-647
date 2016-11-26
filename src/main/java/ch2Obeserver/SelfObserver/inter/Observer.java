package ch2Obeserver.SelfObserver.inter;

/**
 * Created by zhangzj on 2016/11/26.
 */
public interface Observer {
    public void update(Double tempature, Double humidity, Double pressure);
}
