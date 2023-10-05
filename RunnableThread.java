public class RunnableThread implements Runnable{

    private Thread t;
    private String threadName;

    RunnableThread(String name){
        this.threadName = name;
    }
    public void run() {
        //LazyInitializedSingleton.getInstance();
        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
        System.out.println(Enum.INSTANCE.hashCode() + " This is should be Thread Safe");

        //System.out.println("Your Thread, " + threadName + " is running.");
    }

    public void start(){
        if (t == null){
            t=new Thread(this, threadName);
            t.start();
        }
    }
}
