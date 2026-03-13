class NewThread implements Runnable {
    Thread t;

    NewThread(String s) {
        t = new Thread(this, s);
    }

    public void run() {
       
        if (t.getName().equals("FIRST")) {
            System.out.println("Printing 1 to 100:");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Printing 100 to 1:");
            for (int i = 100; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}

class Check_task{
    public static void main(String args[]) {
       NewThread t1 = new NewThread("FIRST");
        NewThread t2 = new NewThread("SECOND");
    }
}
