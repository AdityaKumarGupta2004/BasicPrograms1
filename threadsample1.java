class Mythr extends Thread {
    public void run() {
        synchronized(this) { // Synchronize on the instance of Mythr
            int i = 0;
            while (i < 1000) {
                System.out.println("I am in thread 1 and I'm good ");
                i++;
            }
        }
    }
} 

class Mythr2 extends Thread {
    public void run() {
        synchronized(this) { // Synchronize on the instance of Mythr2
            int i = 0;
            while (i < 1000) {
                System.out.println("I am in thread 2 ");
                
                i++;
            }
        }
    }
}

class threadsample1 {
    public static void main(String[] args) {
        Mythr t1 = new Mythr();
        Mythr2 t2 = new Mythr2();
        t1.start();
        t2.start();
    }
}
