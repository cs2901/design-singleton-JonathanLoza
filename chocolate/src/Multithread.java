class MultithreadingDemo extends Thread
{
    public void run()
    {
            // Displaying the thread that is running
            ChocolateBoiler instance= ChocolateBoiler.getInstance();

    }
}
public class Multithread
{
    public static void main(String[] args) throws InterruptedException {
        int n = 80; // Number of threads
        for (int i=0; i<n; i++)
        {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
            object.join();
        }
    }
}