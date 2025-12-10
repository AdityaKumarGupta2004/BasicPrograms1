

public class Counter1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating multiple threads
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        CounterThread t3 = new CounterThread(counter);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Waiting for all threads to finish
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
class Counter {
    private int count = 0;

    // Synchronized method to ensure only one thread can access this at a time
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}