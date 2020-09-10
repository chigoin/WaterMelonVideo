package pers.faiz.test.model;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Mythread {

    public static void main(String[] args){
//        1、继承自Thread类
//        NewThread thread = new NewThread();
//        thread.start();

//        2、实现Runnable方法
//
//        实现Callable接口
        Callable<String> callable = new CallableThread();
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        doingSomething();

        try{
            String result = futureTask.get();
            System.out.println("result = "+result);

        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();

        }

    }

    private static void doingSomething(){
        System.out.println("我是主线程");
    }
}
