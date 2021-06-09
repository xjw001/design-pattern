package responsibilitychain;

import lombok.Data;

/**
 * 抽象处理者
 */
@Data
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public abstract void handle(int type);
}
