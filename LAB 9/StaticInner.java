public class StaticInner {

    static int i = 10;
    static class Inner{
        void print(){
            System.out.println("Static variable = " + i);
        }
    }

    public static void main(String[] args) {
        StaticInner.Inner l1 = new StaticInner.Inner();

        l1.print();
    }
}
