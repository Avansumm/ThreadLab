public class Main {
    public static void main(String[] args) {
        RunnableThread firstthread = new RunnableThread("First Thread");
        RunnableThread secondthread = new RunnableThread("Second Thread");
        RunnableThread thirdthread = new RunnableThread("Third Thread");

        firstthread.start();
        secondthread.start();
        thirdthread.start();
        //System.out.println(firstthread.hashCode());
        //System.out.println(secondthread.hashCode());
        //System.out.println(firstthread.hashCode());
        //firstthread.hashCode();
    }
}