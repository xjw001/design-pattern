package responsibilitychain;

public class ConcreteHanderA extends AbstractHandler {
    @Override
    public void handle(int type) {
        if(type == 1){
            System.out.println("处理类型1的任务");
        }else{
            if(nextHandler == null){
                System.out.println("无人处理");
                return;
            }
            nextHandler.handle(type);
        }
    }
}
