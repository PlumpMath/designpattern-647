package ch6Command;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public interface Command {
    public void execute();
    public void undo();
}
