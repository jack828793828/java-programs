public class ThreadExample {
    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Producer producing item: " + i);
            Thread.yield(); // Yield execution to other threads
        }
    }
}

class Consumer implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consumer consuming item: " + i);
            try {
                Thread.sleep(1000); // Pause execution for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

