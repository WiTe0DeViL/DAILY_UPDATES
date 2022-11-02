public class A {

    public static void main(String[] args) throws InterruptedException {
    int a = 10;
    int b = 20;
    int c = 30;
        SimpleInterface simpleInterface = new SimpleInterface() {
            @Override
            public void add(int total) throws InterruptedException {
                Thread.sleep(5000);
                System.out.println("Total " + total);
            }
        };


        B obj = new B();
        obj.calculate(a,b,c,simpleInterface);

    }


}
