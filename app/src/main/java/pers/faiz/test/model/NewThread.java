package pers.faiz.test.model;

public class NewThread extends Thread {

    @Override
    public void run() {
        doingSomething();
    }

    private void doingSomething() {
        System.out.println("我是一个线程方法");
    }
}
