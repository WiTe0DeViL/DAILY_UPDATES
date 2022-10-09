import java.io.*;

// mask password with asterisk java console
class ThreadDisappear implements Runnable {
    private boolean end;

    public ThreadDisappear(String prompt) {
        System.out.print(prompt);
    }

    public void run() {
        end = true;
        while (end) {
            System.out.print("\010*");
            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void maskEnd() {
        this.end = false;

    }

}


class password {
    public static void main(String[] args) {
        ThreadDisappear td = new ThreadDisappear("Enter your password: ");
        Thread t = new Thread(td);
        t.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String password = br.readLine();
            td.maskEnd();
            System.out.println("\nYour password is: " + password);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}