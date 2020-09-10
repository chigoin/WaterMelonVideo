package pers.faiz.test.model;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(6000);
        doingSomething();
        return "需要返回的值";
    }

    private void doingSomething(){
        System.out.println("我是一个线程");
    }

}
