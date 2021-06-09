package responsibilitychain;

public class ConcreteHanderC extends AbstractHandler {
    @Override
    public void handle(int type) {
        if(type == 3){
            System.out.println("处理类型3任务");
        }else{
            if(nextHandler == null){
                System.out.println("无人处理");
            }else{
                nextHandler.handle(type);
            }
        }
    }
}
