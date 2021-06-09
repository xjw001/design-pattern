package responsibilitychain;

public class ConcreteHandlerB extends AbstractHandler {

    @Override
    public void handle(int type) {
        if(type == 2){
            System.out.println("处理类型2的任务");
        }else{
            if(nextHandler == null){
                System.out.println("无人处理");
            }else{
                nextHandler.handle(type);
            }
        }
    }
}
