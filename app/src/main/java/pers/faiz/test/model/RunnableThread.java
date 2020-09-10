package pers.faiz.test.model;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
       doingSomething();
    }

    private void doingSomething(){
        System.out.println("我是一个线程方法");
    }
}
