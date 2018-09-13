package Facade;

public class Runner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.startProcess();
        System.out.println("-----------------------------");
        workFlow.finishProcess();
    }
}
