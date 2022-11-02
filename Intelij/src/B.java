public class B {
    void calculate() {
    }
    public void calculate(int a, int b, int c, SimpleInterface simpleInterface) throws InterruptedException {
        int d = a + b + c;
        simpleInterface.add(d);
        float discount = (float) ((d / 100.0) * 10);
        System.out.println("Discount " + discount);
    }
}
